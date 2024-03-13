package com.github.hicoincom.api.bean.mpc;

import com.github.hicoincom.api.bean.BaseCustodyArgs;

import java.io.Serializable;

/**
 * @author ChainUp Custody
 * @description Create Web3 Transaction, https://custodydocs-en.chainup.com/api-references/mpc-apis/apis/web3/web3-create
 */
public class MpcWeb3TransArgs extends BaseCustodyArgs implements Serializable {

    private static final long serialVersionUID = 3278172340747622780L;

    /**
     * Wallet ID
     * required : true
     */
    private Integer subWalletId;

    /**
     * The unique identifier for transferring coins
     * required : true
     */
    private String requestId;

    /**
     * Main chain coin symbol, Unique identifier for the coin, e.g.：ETH
     * required: true
     */
    private String mainChainSymbol;

    /**
     * Transaction initiation address. In the case of multiple addresses in the wallet, you can specify the transaction address.
     * If not specified, the wallet’s “commonly used address” will be used by default.
     * required: false
     */
    private String from;

    /**
     * Interactive contract
     * required: true
     */
    private String interactiveContract;

    /**
     * Transfer amount
     * required : true
     */
    private String amount;

    /**
     * Gas fee，unit：Gwei
     * required : true
     */
    private String gasPrice;

    /**
     * Gas limit fee
     * required : true
     */
    private String gasLimit;

    /**
     * Hexadecimal data for contract transaction
     * required : true
     */
    private String inputData;

    /**
     * 0: Authorization transaction, 1: Other transaction. If 0, the amount field is invalid.
     * required : true
     */
    private String transType;

    /**
     * Dapp name
     * required : false
     */
    private String dappName;

    /**
     * Dapp URL
     * required : false
     */
    private String dappUrl;

    /**
     * Dapp image
     * required : false
     */
    private String dappImg;

    /**
     * RSA private key signature.
     * Parameters involved in the signature: “request_id”, “sub_wallet_id”, “main_chain_symbol”, “interactive_contract”, “amount”, “input_data”.
     * signature rules: https://custodydocs-en.chainup.com/api-references/mpc-apis/co-signer/sign-verify
     *
     * required : false
     */
    private String sign;

    public Integer getSubWalletId() {
        return subWalletId;
    }

    public void setSubWalletId(Integer subWalletId) {
        this.subWalletId = subWalletId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMainChainSymbol() {
        return mainChainSymbol;
    }

    public void setMainChainSymbol(String mainChainSymbol) {
        this.mainChainSymbol = mainChainSymbol;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getInteractiveContract() {
        return interactiveContract;
    }

    public void setInteractiveContract(String interactiveContract) {
        this.interactiveContract = interactiveContract;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    public String getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(String gasLimit) {
        this.gasLimit = gasLimit;
    }

    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getDappName() {
        return dappName;
    }

    public void setDappName(String dappName) {
        this.dappName = dappName;
    }

    public String getDappUrl() {
        return dappUrl;
    }

    public void setDappUrl(String dappUrl) {
        this.dappUrl = dappUrl;
    }

    public String getDappImg() {
        return dappImg;
    }

    public void setDappImg(String dappImg) {
        this.dappImg = dappImg;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }


    public static final class MpcWeb3TransArgsBuilder {
        private Integer subWalletId;
        private String requestId;
        private String mainChainSymbol;
        private String from;
        private String interactiveContract;
        private String amount;
        private String gasPrice;
        private String gasLimit;
        private String inputData;
        private String transType;
        private String dappName;
        private String dappUrl;
        private String dappImg;
        private String sign;

        private MpcWeb3TransArgsBuilder() {
        }

        public static MpcWeb3TransArgsBuilder aMpcWeb3TransArgs() {
            return new MpcWeb3TransArgsBuilder();
        }

        public MpcWeb3TransArgsBuilder subWalletId(Integer subWalletId) {
            this.subWalletId = subWalletId;
            return this;
        }

        public MpcWeb3TransArgsBuilder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MpcWeb3TransArgsBuilder mainChainSymbol(String mainChainSymbol) {
            this.mainChainSymbol = mainChainSymbol;
            return this;
        }

        public MpcWeb3TransArgsBuilder from(String from) {
            this.from = from;
            return this;
        }

        public MpcWeb3TransArgsBuilder interactiveContract(String interactiveContract) {
            this.interactiveContract = interactiveContract;
            return this;
        }

        public MpcWeb3TransArgsBuilder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public MpcWeb3TransArgsBuilder gasPrice(String gasPrice) {
            this.gasPrice = gasPrice;
            return this;
        }

        public MpcWeb3TransArgsBuilder gasLimit(String gasLimit) {
            this.gasLimit = gasLimit;
            return this;
        }

        public MpcWeb3TransArgsBuilder inputData(String inputData) {
            this.inputData = inputData;
            return this;
        }

        public MpcWeb3TransArgsBuilder transType(String transType) {
            this.transType = transType;
            return this;
        }

        public MpcWeb3TransArgsBuilder dappName(String dappName) {
            this.dappName = dappName;
            return this;
        }

        public MpcWeb3TransArgsBuilder dappUrl(String dappUrl) {
            this.dappUrl = dappUrl;
            return this;
        }

        public MpcWeb3TransArgsBuilder dappImg(String dappImg) {
            this.dappImg = dappImg;
            return this;
        }

        public MpcWeb3TransArgsBuilder sign(String sign) {
            this.sign = sign;
            return this;
        }

        public MpcWeb3TransArgs build() {
            MpcWeb3TransArgs mpcWeb3TransArgs = new MpcWeb3TransArgs();
            mpcWeb3TransArgs.setSubWalletId(subWalletId);
            mpcWeb3TransArgs.setRequestId(requestId);
            mpcWeb3TransArgs.setMainChainSymbol(mainChainSymbol);
            mpcWeb3TransArgs.setFrom(from);
            mpcWeb3TransArgs.setInteractiveContract(interactiveContract);
            mpcWeb3TransArgs.setAmount(amount);
            mpcWeb3TransArgs.setGasPrice(gasPrice);
            mpcWeb3TransArgs.setGasLimit(gasLimit);
            mpcWeb3TransArgs.setInputData(inputData);
            mpcWeb3TransArgs.setTransType(transType);
            mpcWeb3TransArgs.setDappName(dappName);
            mpcWeb3TransArgs.setDappUrl(dappUrl);
            mpcWeb3TransArgs.setDappImg(dappImg);
            mpcWeb3TransArgs.setSign(sign);
            return mpcWeb3TransArgs;
        }
    }
}