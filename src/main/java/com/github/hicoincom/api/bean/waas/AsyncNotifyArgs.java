package com.github.hicoincom.api.bean.waas;

import com.github.hicoincom.api.bean.BaseArgs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ChainUp Custody
 * Asynchronous notification interface parameters
 * http://docs.hicoin.vip/zh/latest/API-WaaS-V2/api/billing_notify.html
 */
public class AsyncNotifyArgs extends BaseArgs implements Serializable {

    private static final long serialVersionUID = 8498681454670355503L;

    private String side;

    private Date notifyTime;

    private String requestId;

    private Integer id;

    private String uid;

    private String symbol;

    private BigDecimal amount;

    private String withdrawFeeSymbol;

    private BigDecimal withdrawFee;

    private String feeSymbol;

    private BigDecimal realFee;

    private String addressTo;

    private Date createdAt;

    private Date updatedAt;

    private String txid;

    private Integer confirmations;

    private Integer status;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getWithdrawFeeSymbol() {
        return withdrawFeeSymbol;
    }

    public void setWithdrawFeeSymbol(String withdrawFeeSymbol) {
        this.withdrawFeeSymbol = withdrawFeeSymbol;
    }

    public BigDecimal getWithdrawFee() {
        return withdrawFee;
    }

    public void setWithdrawFee(BigDecimal withdrawFee) {
        this.withdrawFee = withdrawFee;
    }

    public String getFeeSymbol() {
        return feeSymbol;
    }

    public void setFeeSymbol(String feeSymbol) {
        this.feeSymbol = feeSymbol;
    }

    public BigDecimal getRealFee() {
        return realFee;
    }

    public void setRealFee(BigDecimal realFee) {
        this.realFee = realFee;
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}