// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

import "@klaytn/contracts/KIP/token/KIP17/extensions/KIP17URIStorage.sol";
import "./utils/PermitControl.sol";

contract Certi is KIP17URIStorage, PermitControl {
    struct WorkInfo {
        uint256 workId;
        uint256 workIndex;
    }

    string private _hostUrl;

    mapping(uint256 => uint256) private _workCounter;
    mapping(uint256 => WorkInfo) private _workOfNFT;

    constructor() KIP17("Certi", "CRT") {
        _hostUrl = "http://3.35.60.2:9200/";
    }

    function mintArt(address to, uint256 newItemId, uint256 workId)
        public
        onlyMinter
        returns (uint256)
    {
        address buyer = to;
        _mint(buyer, newItemId);

        _setTokenURI(newItemId, Strings.toString(workId));

        _workCounter[workId] = _workCounter[workId] + 1;
        _workOfNFT[newItemId].workId = workId;
        _workOfNFT[newItemId].workIndex = _workCounter[workId];

        return newItemId;
    }

    function tokenURI(uint256 tokenId) public view override(KIP17URIStorage) returns (string memory) {
        string memory url = string.concat(_hostUrl, "nftInfo/");
        url = string.concat(url, Strings.toHexString(uint160(address(this)), 20));
        url = string.concat(url, "/");
        url = string.concat(url, super.tokenURI(tokenId)); // work_id
        url = string.concat(url, "/");
        url = string.concat(url, Strings.toString(tokenId)); // nft_id

        return url;
    }

    function getHostURL() external view returns(string memory) {
        return _hostUrl;
    }

    function setHostURL(string memory hostUrl) public onlyOwner {
        _hostUrl = hostUrl;
    }

    function getWorkTotalCount(uint256 workId) external view returns(uint256) {
        return _workCounter[workId];
    }

    function getWorkInfo(uint256 nftId) external view returns(WorkInfo memory) {
        return _workOfNFT[nftId];
    }
}