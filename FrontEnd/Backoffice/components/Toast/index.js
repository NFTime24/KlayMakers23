import styles from "./Toast.module.css";
import IconCheck from "../../public/assets/icon-check.svg";
import IconWarning from "../../public/assets/icon-warning.svg";

export default function ({ state, onClick, close, message })
{
    return (
        <div className={ styles.toast }>
            <div className={ styles.notion }>
                {
                    state === "success" ? <IconCheck/> : <IconWarning/>
                }
                <div className={ styles.message }>
                    {
                        state === "success" ? (
                            <>
                                <span className={ styles.state }>{ "Success" }</span>
                                <span className={ styles.confirm }>{ message }</span>
                            </>
                        ) : (
                            <>
                                <span className={ styles.state }>{ "Failed" }</span>
                                <span className={ styles.confirm }>{ "Please try to register again" }</span>
                            </>
                        )
                    }
                </div>
            </div>
            {
                state === "success" ? (
                    <div className={ styles.buttonGroup }>
                        <button type="button" className={styles.button } data-color="white" onClick={ close }>
                            <label>{ "Cancel" }</label>
                        </button>
                        <button type="button" className={styles.button } onClick={ onClick }>
                            <label>{ "Yes" }</label>
                        </button>
                    </div>
                ) : (
                    <div className={ styles.buttonGroup }>
                        <button type="button" className={styles.button } onClick={ close }>
                            <label>{ "Retry" }</label>
                        </button>
                    </div>
                )
            }
        </div>
    )
}