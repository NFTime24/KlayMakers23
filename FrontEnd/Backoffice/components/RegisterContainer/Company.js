import styles from "./RegisterContainer.module.css";

export default function ({ setName, setDescription, setUrl })
{
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
            <div className={ styles.item }>
                <label className={ styles.label }>{ "Company name" }</label>
                <textarea className={ styles.input } onChange={ onChangeName }/>
            </div>
            <div className={ styles.item } data-long={true}>
                <label className={ styles.label }>{ "Company Description" }</label>
                <textarea className={ styles.input } onChange={ onChangeDescription } data-long={true}/>
            </div>
            <div className={ styles.item }>
                <label className={ styles.label }>{ "Company Website" }</label>
                <textarea className={ styles.input } onChange={ onChangeUrl }/>
            </div>
        </div>
    )
}