import { useRouter } from "next/router";
import { useState } from "react";

import AppLayout from "@/components/AppLayout";
import ActionButton from "@/components/ActionButton";
import Image from "@/components/IssueContainer/Image";
import IssueContainer from "components/IssueContainer/InputContainer";
import Issue from "@/components/Toast/Issue";

import styles from "../../styles/Register.module.css";

export default function ()
{
    const router = useRouter();

    const [certificate, setCertificate] = useState('');
    const [receiver, setReceiver] = useState('');
    const [address, setAddress] = useState('');

    const [image, setImage] = useState('');

    const [isOpened, setIsOpened] = useState(false);

    const onSubmit = async (e) =>
    {
        e.preventDefault();
        setIsOpened(true);
    };

    const onClick = async () =>
    {
        await router.push('/dashboards/certificate-list');
    };

    return (
        <AppLayout category="Issue" menu="Certificate" >
            <form className={ styles.container } onSubmit={ onSubmit }>
                <span className={ styles.title }>{ "Issue Digital Certificate" }</span>

                <div className={ styles.formContainer }>
                    <div className={ styles.inputContainer }>
                        <Image image={ image }/>
                        <IssueContainer setCertificate={ setCertificate } setReceiver={ setReceiver } setAddress={ setAddress } setImage={ setImage }/>
                    </div>
                    <ActionButton width={185} disabled={ !(!!certificate && !!receiver && !!address) } onClick={ onSubmit }>{ "Issue" }</ActionButton>
                </div>
            </form>
            {
                isOpened && <Issue onClick={ onClick }/>
            }
        </AppLayout>
    )
}