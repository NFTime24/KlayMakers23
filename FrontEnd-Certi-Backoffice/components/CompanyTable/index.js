import { useState } from "react";
import ReactPaginate from "react-paginate";

import CompanyItem from "@/components/CompanyItem";

import styles from "./CompanyTable.module.css";

export default function ()
{
    return (
        <div className={ styles.table }>
            <div className={ styles.columns }>
                <div className={ styles.name }>
                    <label>{ "Company" }</label>
                </div>
                <div className={ styles.data }>
                    <label>{ "Certificate" }</label>
                </div>
                <div className={ styles.data }>
                    <label>{ "Issue" }</label>
                </div>
                <div className={ styles.data }>
                    <label>{ "Date" }</label>
                </div>
            </div>
            <CompanyItem
                image="/assets/dummies/company_protocolcamp.png"
                name="Protocol Camp"
                description="Protocol Camp is a program that develops real-world products related to blockchain. Anyone who is dreaming of a career in the blockchain ecosystem can apply. Be a member of the Web3.0 ecosystem community created by Protocol Camp to discover personal growth potential and draw a career blueprint in the blockchain industry."
                certificateNum={1}
                issueNum={1}
                date="2023.11.20"
            />
            <CompanyItem
                image="/assets/dummies/company_image_dreamplus academy.png"
                name="Dreamplus Academy"
                description="Dream Plus Academy aims to cultivate top experts in cybersecurity. It is an enterprising community where Dreamer, the organizer, Hanwha Life, and the global cybersecurity expert group, Tiori, work together to build an ecosystem."
                certificateNum={1}
                issueNum={19}
                date="2023.11.15"
            />
            <CompanyItem
                image="/assets/dummies/company_ewha_university.png"
                name="Ewha Womans University"
                description="Korea's first female school and university. Its predecessor is Ewha Hakdang, founded in 1886, the fifth oldest institution of higher education in Korea."
                certificateNum={1}
                issueNum={24}
                date="2023.11.15"
            />
            <CompanyItem
                image="/assets/dummies/company_skku.png"
                name="Sungkyunkwan University"
                description="Korea's oldest institution of higher education in Asia with a history of 625 years"
                certificateNum={1}
                issueNum={32}
                date="2023.11.05"
            />
        </div>
    )
}