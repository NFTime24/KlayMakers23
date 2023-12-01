import styles from "./Toast.module.css";
import IconCheck from "../../public/assets/icon-check.svg";

export default function ({ onClick })
{
    return (
        <div className={ styles.toast }>
            <div className={ styles.notion }>
                <IconCheck/>
                <div className={ styles.message }>
                    <span className={ styles.state }>{ "Success" }</span>
                    <span className={ styles.confirm }>{ "Your digital certificate has been issued." }</span>
                </div>
            </div>
            <div className={ styles.buttonGroup }>
                <button type="button" className={styles.button } onClick={ onClick }>
                    <label>{ "OK" }</label>
                </button>
            </div>
        </div>
    )
}