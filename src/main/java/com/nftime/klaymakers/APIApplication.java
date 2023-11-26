package com.nftime.klaymakers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */
@SpringBootApplication
@Slf4j
@EnableAsync
@EnableRetry
@EnableKafka
@EnableAspectJAutoProxy
@EnableScheduling
@EnableTransactionManagement
public class APIApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(APIApplication.class);
        app.addListeners(new ApplicationPidFileWriter("./bin/nftimeapi.pid"));
        app.run(args);

        log.info("*********************************************************************************************************************************");
        log.info("**************************************************Nftime API started*************************************************************");
        log.info("*********************************************************************************** created by dy.lee, mk.lee *******************");
    }
}
