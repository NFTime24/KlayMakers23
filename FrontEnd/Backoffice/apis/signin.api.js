import axios from "axios";

export const signin = async (id, password) =>
{
    try
    {
        return await axios.post('https://3.39.120.32:9200/back-office/login', { id: id, password: password });
    }
    catch (error)
    {
        console.log('error : ', error);
        return error;
    }
};