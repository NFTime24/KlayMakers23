module.exports = async function main (callback) {
    try {
        const accounts = await web3.eth.getAccounts();
        const owner = accounts[0];
        
        const Certi = artifacts.require('Certi');
        const certi = await Certi.deployed();

        await certi.permitMinter("0x7c07C1579aD1980863c83876EC4bec43BC8d6dFa");
        console.log(await certi.isMinter("0x7c07C1579aD1980863c83876EC4bec43BC8d6dFa"));

        await certi.mintArt(owner, 1, 1);
  
        callback(0);
    } catch (error) {
        console.error(error);
        callback(1);
    }
};