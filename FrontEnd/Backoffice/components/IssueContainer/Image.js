import styles from "./IssueContainer.module.css";
import IconPhoto from "@/public/assets/icon-photo.svg";

export default function ({ image })
{
    return (
        <div className={ styles.imageContainer }>
            <div className={ styles.header }>
                <span className={ styles.label }>{ "Certificate Profile" }</span>
            </div>
            <div className={ styles.selector }>
                {

                    image ? (
                        <img src={ image } alt="test" className={ styles.image }/>
                    ) : (
                        <div className={ styles.icon }>
                            <IconPhoto/>
                        </div>
                    )
                }
            </div>
        </div>
    )
}