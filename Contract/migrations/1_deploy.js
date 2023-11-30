const Certi = artifacts.require('Certi');
const AbiHelper = artifacts.require('AbiHelper');

module.exports = async function (deployer) {
  await deployer.deploy(Certi);
  // await deployer.deploy(AbiHelper);
};