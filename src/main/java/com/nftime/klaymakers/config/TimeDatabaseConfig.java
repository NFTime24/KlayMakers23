package com.nftime.klaymakers.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.nftime.klaymakers.repository.time", // time repository 패키지 경로
        entityManagerFactoryRef = "timeEntityManager",
        transactionManagerRef = "timeTransactionManager"
)
@Slf4j
public class TimeDatabaseConfig {
    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean timeEntityManager() {
        LocalContainerEntityManagerFactoryBean em =
                new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(timeDataSource());
        em.setPackagesToScan(
                "com.nftime.klaymakers.entity.time"
        );

        HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(va);

        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "none");
        properties.setProperty("hibernate.show_sql", "false");
        properties.setProperty("hibernate.physical_naming_strategy", "org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty("hibernate.format_sql", "true");

        em.setJpaProperties(properties);
        return em;
    }

    @Primary
    @Bean("timeDataSource")
    public DataSource timeDataSource() {
        return new HikariDataSource(timeHikariConfig());
    }

    @Primary
    @Bean("timeHikariConfig")
    @ConfigurationProperties(prefix = "spring.datasource.time.hikari")
    public HikariConfig timeHikariConfig() {
        return new HikariConfig();
    }

    @Primary
    @Bean
    public PlatformTransactionManager timeTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(timeEntityManager().getObject());

        return transactionManager;
    }

    @Primary
    @Bean
    public PersistenceExceptionTranslationPostProcessor timeExceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
}