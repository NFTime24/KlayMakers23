import CertificateItem from "@/components/CertificateItem";

import styles from "./CertificateTable.module.css";

export default function ()
{
    return (
        <div className={ styles.table }>
            <div className={ styles.columns }>
                <div className={ styles.name }>
                    <label>{ "Certificate" }</label>
                </div>
                <div className={ styles.data }>
                    <label>{ "Company" }</label>
                </div>
                <div className={ styles.data }>
                    <label>{ "Category" }</label>
                </div>
                <div className={ styles.data }>
                    <label>{ "Issue" }</label>
                </div>
                <div className={ styles.data }>
                    <label>{ "Date" }</label>
                </div>
            </div>
            <CertificateItem
                image="/assets/dummies/certificate_image_protocolcamp.png"
                name="Dream Plus x Hashed, Protocol Camp Certificate"
                description="Congratulations on the completion of the blockchain boot camp protocol camp with Dream Plus and Hashed."
                companyName="Protocol Camp"
                category="Diploma"
                issueNum={1}
                date="2023.11.20"
            />
            <CertificateItem
                image="/assets/dummies/certificate_image_dreamplus_academy.jpg"
                name="Dreamplus Academy 2nd"
                description="Congratulations on completing the 2nd Dream Plus Academy."
                companyName="Dreamplus"
                category="Diploma"
                issueNum={19}
                date="2023.11.15"
            />
            <CertificateItem
                image="/assets/dummies/certificate_image_ewha_chain.png"
                name="EWHA-CHAIN"
                description="Certificate of Completion of the Blockchain Society of Ewha Womans University"
                companyName="Ewha Womans University"
                category="Diploma"
                issueNum={24}
                date="2023.11.09"
            />
            <CertificateItem
                image="/assets/dummies/certificate_image_Skkrypto.jpg"
                name="SKKRYPTO"
                description="Sungkyunkwan University Blockchain Society Certificate"
                companyName="Sungkyunkwan University"
                category="Diploma"
                issueNum={32}
                date="2023.11.05"
            />
        </div>
    )
}