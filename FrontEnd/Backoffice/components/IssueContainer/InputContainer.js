import styles from "./IssueContainer.module.css";

export default function ({ setCertificate, setReceiver, setAddress, setImage })
{
    const onChangeCertificate = (e) =>
    {
        setCertificate(e.target.value);
        setImage("/assets/dummies/certificate_image_protocolcamp.png");
    };

    const onChangeReceiver = (e) =>
    {
        setReceiver(e.target.value);
    };

    const onChangeAddress = (e) =>
    {
        setAddress(e.target.value);
    };

    return (
        <div className={ styles.container }>
            <div className={ styles.item }>
                <label className={ styles.label }>{ "Choose Certificate" }</label>
                <select className={ styles.input } onChange={ onChangeCertificate }>
                    <option>{ "Select Certificate" }</option>
                    <option>{ "Dream Plus x Hashed, Protocol Camp Certificate" }</option>
                    <option>{ "Dreamplus Academy 2nd" }</option>
                    <option>{ "EWHA-CHAIN" }</option>
                    <option>{ "SKKRYPTO" }</option>
                </select>
            </div>

            <div className={ styles.controller }>
                <div className={ styles.item }>
                    <label className={ styles.label }>{ "Receiver" }</label>
                    <input className={ styles.receiver } onChange={ onChangeReceiver }/>
                </div>
                <div className={ styles.item }>
                    <label className={ styles.label }>{ "Receiver Wallet Address" }</label>
                    <input className={ styles.address } onChange={ onChangeAddress }/>
                </div>
            </div>
        </div>
    );
}