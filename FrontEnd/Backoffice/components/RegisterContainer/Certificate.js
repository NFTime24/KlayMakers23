import styles from "./RegisterContainer.module.css";

export default function ({ setCompany, setCategory, setStartDate, setEndDate, setName, setDescription, setUrl })
{
    const onChangeCompany = (e) =>
    {
        setCompany(e.target.value);
    };

    const onChangeCategory = (e) =>
    {
        setCategory(e.target.value);
    };

    const onChangeStartDate = (e) =>
    {
        setStartDate(e.target.value);
    };

    const onChangeEndDate = (e) =>
    {
        setEndDate(e.target.value);
    };

    const onChangeName = (e) =>
    {
        setName(e.target.value);
    };

    const onChangeDescription = (e) =>
    {
        setDescription(e.target.value);
    };

    const onChangeUrl = (e) =>
    {
        setUrl(e.target.value);
    };

    return (
        <div className={ styles.container }>
            <div className={ styles.pair }>
                <div className={ styles.item }>
                    <label className={ styles.label }>{ "Choose Company" }</label>
                    <select className={ styles.input } onChange={ onChangeCompany }>
                        <option>{ "Select Company" }</option>
                        <option>{ "Protocol Camp" }</option>
                        <option>{ "Dreamplus Academy" }</option>
                        <option>{ "Ewha Womans University" }</option>
                        <option>{ "Sungkyunkwan University" }</option>
                    </select>
                </div>
                <div className={ styles.item }>
                    <label className={ styles.label }>{ "Certificate Category" }</label>
                    <select className={ styles.input } onChange={ onChangeCategory }>
                        <option>{ "Select Category" }</option>
                        <option>{ "Diploma" }</option>
                        <option>{ "Contest" }</option>
                        <option>{ "License" }</option>
                        <option>{ "Others" }</option>
                    </select>
                </div>
            </div>

            <div className={ styles.pair }>
                <div className={ styles.item }>
                    <label className={ styles.label }>{ "Start date" }</label>
                    <input type="text" className={ styles.input } onChange={ onChangeStartDate }/>
                </div>
                <div className={ styles.item }>
                    <label className={ styles.label }>{ "End date" }</label>
                    <input type="text" className={ styles.input } onChange={ onChangeEndDate }/>
                </div>
            </div>

            <div className={ styles.item }>
                <label className={ styles.label }>{ "Certificate name" }</label>
                <textarea className={ styles.input } onChange={ onChangeName }/>
            </div>
            <div className={ styles.item }>
                <label className={ styles.label }>{ "Certificate Website" }</label>
                <textarea className={ styles.input } onChange={ onChangeUrl }/>
            </div>
            <div className={ styles.item } data-long={true}>
                <label className={ styles.label }>{ "Certificate Description" }</label>
                <textarea className={ styles.input } onChange={ onChangeDescription } data-long={true}/>
            </div>
        </div>
    )
}