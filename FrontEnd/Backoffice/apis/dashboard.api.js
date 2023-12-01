import axios from "axios";

export const getStatistics = async () =>
{
    try
    {
        return await axios.get('https://3.39.120.32:9200/back-office/stat');
    }
    catch (error)
    {
        console.log('error : ', error);
        return error;
    }
};

export const getCompanyList = async () =>
{
    try
    {
        return await axios.get('https://3.39.120.32:9200/company/list');
    }
    catch (error)
    {
        console.log('error : ', error);
        return error;
    }
};

export const getCertificateList = async () =>
{
    try
    {
        return await axios.get('https://3.39.120.32:9200/certificate/list');
    }
    catch (error)
    {
        console.log('error : ', error);
        return error;
    }
};