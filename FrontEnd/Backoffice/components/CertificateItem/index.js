import RemoteImage from "@/components/RemoteImage";

import styles from "./CertificateItem.module.css";

export default function ({ image, name, description, companyName, category, issueNum, date })
{
    return (
        <div className={ styles.item }>
            <div className={ styles.info }>
                <RemoteImage src={ image } shape="certificate"/>
                <div className={ styles.text }>
                    <span>{ name }</span>
                    <span className={ styles.description }>{ description }</span>
                </div>
            </div>
            <div className={ styles.data }>
                <span>{ companyName }</span>
            </div>
            <div className={ styles.data }>
                <span>{ category }</span>
            </div>
            <div className={ styles.data }>
                <span>{ issueNum }</span>
            </div>
            <div className={ styles.data }>
                <span>{ date }</span>
            </div>
        </div>
    )
}