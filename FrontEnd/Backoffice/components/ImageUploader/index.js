import { useRef, useState } from "react";

import styles from "./ImageUploader.module.css";
import IconPhoto from "../../public/assets/icon-photo.svg";

export default function ({ children, setImage })
{
    const imageSelector = useRef();
    const [photo, setPhoto] = useState('');

    const _onChange = (e) =>
    {
        const reader = new FileReader();

        reader.onload = (event) =>
        {
            const data = event.target.result;
            setPhoto(data);
            setImage(data);
        };

        // setImage(e.target.files[0]);

        reader.readAsDataURL(e.target.files[0]);
    };

    const _onClick = () =>
    {
        imageSelector.current.click();
    };

    return (
        <div className={ styles.container }>
            <div className={ styles.header }>
                <span className={ styles.label }>{ children }</span>
                <span className={ styles.description }>{ "Click upload Logo, allowed file types: png, jpg, jpeg." }</span>
            </div>

            <div className={ styles.selector }>
                <input type="file" className={ styles.file } ref={ imageSelector } onChange={ _onChange }/>
                {
                    photo ? (
                        <img src={ photo } alt="test" className={ styles.img }/>
                    ) : (
                        <button type="button" className={ styles.uploadButton } onClick={ _onClick }>
                            <IconPhoto/>
                        </button>
                    )
                }
            </div>
        </div>
    )
}