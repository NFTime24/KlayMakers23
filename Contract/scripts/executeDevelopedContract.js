module.exports = async function main (callback) {
    try {
        const accounts = await web3.eth.getAccounts();
        const owner = accounts[0];
        
        const Certi = artifacts.require('Certi');
        //const artoken = await Artoken.at("0xB3290A3DC1cd576e85E56D0ad49d281B08BA0697");
        //const artoken = await Artoken.at("0x39E175d5CC9A0D3332E77f8Da2351eF794B72510");
        const certi = await Certi.at("0x3f76890cD95Da20792646821ac7220891d73DE1a");
        
        console.log(await certi.tokenURI(1));
  
        callback(0);
    } catch (error) {
        console.error(error);
        callback(1);
    }
};