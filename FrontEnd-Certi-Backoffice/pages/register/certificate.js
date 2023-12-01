import { useRouter } from "next/router";
import { useState } from "react";

import AppLayout from "@/components/AppLayout";
import ImageUploader from "@/components/ImageUploader";
import CertificateRegisterContainer from "@/components/RegisterContainer/Certificate";
import ActionButton from "@/components/ActionButton";
import Toast from "@/components/Toast";

import styles from "../../styles/Register.module.css";

export default function ()
{
    const router = useRouter();

    const [image, setImage] = useState('');

    const [company, setCompany] = useState('');
    const [category, setCategory] = useState('');
    const [startDate, setStartDate] = useState('');
    const [endDate, setEndDate] = useState('');

    const [name, setName] = useState('');
    const [url, setUrl] = useState('');
    const [description, setDescription] = useState('');

    const [isOpened, setIsOpened] = useState(false);

    const onSubmit = async (e) =>
    {
        e.preventDefault();
        setIsOpened(true)
    }

    const onClick = async () =>
    {
        await router.push('/issue/certificate');
    };

    const onClose = () =>
    {
        setIsOpened(false);
    };

    return (
        <AppLayout category="Register" menu="Certificate" >
            <form className={ styles.container } onSubmit={ onSubmit }>
                <span className={ styles.title }>{ "Register Certificate" }</span>

                <div className={ styles.formContainer }>
                    <div className={ styles.inputContainer }>
                        <ImageUploader setImage={ setImage }>{ "Certificate Image" }</ImageUploader>
                        <CertificateRegisterContainer
                            setImage={ setImage }
                            setCompany={ setCompany }
                            setCategory={ setCategory }
                            setStartDate={ setStartDate }
                            setEndDate={ setEndDate }
                            setName={ setName }
                            setDescription={ setDescription }
                            setUrl={ setUrl }
                        />
                    </div>
                    <ActionButton type="submit" width={185} disabled={ !(!!image && !!name && !!description && !!url) }>{ "Register" }</ActionButton>
                </div>
            </form>
            {
                isOpened && <Toast state="success" message="Would you like to issue a certificate as well?" close={ onClose } onClick={ onClick }/>
            }
        </AppLayout>
    )
}