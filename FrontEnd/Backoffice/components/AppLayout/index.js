import Link from "next/link";

import MenuButton from "@/components/MenuButton";

import styles from "./AppLayout.module.css";

import Logo from "../../public/assets/logo/logo-layout.svg";

import IconCompany from "../../public/assets/icon-company-20.svg";
import IconCertificate from "../../public/assets/icon-certificate-20.svg";
import IconIssue from "../../public/assets/icon-issue-20.svg";
import IconGrayDot from "../../public/assets/icon-gray-dot-16.svg";
import IconLogout from "../../public/assets/icon-logout-20.svg";

import IconDock from "../../public/assets/icon-dock-28.svg";
import IconAlarm from "../../public/assets/icon-alarm-28.svg";

export default function ({ category, menu, children })
{
    return (
        <div className={ styles.backgroundContainer }>
            <div className={ styles.sidebar }>
                <div className={ styles.menus }>
                    <Link href="/"><Logo/></Link>
                    <div className={ styles.category }>
                        <div className={ styles.title }><span>{ "Register" }</span></div>
                        <MenuButton href="/register/company" icon={ <IconCompany/> } leftPadding={true}>{ "Company" }</MenuButton>
                        <MenuButton href="/register/certificate" icon={ <IconCertificate/> } leftPadding={true}>{ "Certificate" }</MenuButton>
                    </div>
                    <div className={ styles.category }>
                        <div className={ styles.title }><span>{ "Issue" }</span></div>
                        <MenuButton href="/issue/certificate" icon={ <IconIssue/> } leftPadding={true}>{ "Certificate" }</MenuButton>
                    </div>
                    <div className={ styles.category }>
                        <div className={ styles.title }><span>{ "Dashboards" }</span></div>
                        <MenuButton href="/dashboards/company-list" icon={ <IconGrayDot/> } leftPadding={true}>{ "Company list" }</MenuButton>
                        <MenuButton href="/dashboards/certificate-list" icon={ <IconGrayDot/> } leftPadding={true}>{ "Certificate list" }</MenuButton>
                    </div>
                </div>
                <MenuButton href="/" icon={ <IconLogout/> }>{ "Log out" }</MenuButton>
            </div>

            <div className={ styles.topBar }>
                <div className={ styles.dock }>
                    <IconDock/>
                    <div>
                        <span className={ styles.gray }>{ category }</span>
                        <span className={ styles.gray }>{ "/" }</span>
                        <span>{ menu }</span>
                    </div>
                </div>
                <IconAlarm/>
            </div>

            <main className={ styles.body }>
                { children }
            </main>
        </div>
    )
}