import axios from "axios";

export const issueCertificate = async (certificateName, receiver, address) =>
{
    try
    {
        return await axios.post('https://3.39.120.32:9200/certificate/issue', {
            certificateName: certificateName,
            name: receiver,
            walletAddress: address
        })
    }
    catch (error)
    {
        console.log('error : ', error);
        return error;
    }
}