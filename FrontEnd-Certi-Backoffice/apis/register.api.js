import axios from 'axios';

export const registerCompany = async (image, name, description, url) =>
{
    try
    {
        const { data } = await axios.post('https://3.39.120.32:9200/back-office/company/register', {
            companyImage: image,
            companyName: name,
            companyDescription: description,
            companyWebsite: url
        });

        return data;
    }
    catch (error)
    {
        throw error;
    }
}

// export default function ()
// {
//     const apis = {};
//
//     apis.registerCompany = async (image, name, description, url) =>
//     {
//         try
//         {
//             const { data } = await apiRoot.post('/back-office/company/register', {
//                 companyImage: image,
//                 companyName: name,
//                 companyDescription: description,
//                 companyWebsite: url
//             });
//
//             return data;
//         }
//         catch (error)
//         {
//             throw error;
//         }
//     }
//
//     apis.registerCertificate = async (image, companyName, category, name, description, startDate, endDate, url) =>
//     {
//         try
//         {
//             const { data } = await apiRoot.post('/back-office/certificate/register', {
//                 certificateImage: image,
//                 companyName: companyName,
//                 certificateCategory: category,
//                 certificateName: name,
//                 certificateDescription: description,
//                 certificateStartDate: startDate,
//                 certificateEndDate: endDate
//             });
//
//             return data;
//         }
//         catch (error)
//         {
//             throw error;
//         }
//     }
//
//     return apis;
// }