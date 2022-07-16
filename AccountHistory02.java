/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myapppp;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 003H4T744
 */
@Entity
@Table(name = "account_history02", catalog = "mydb1", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AccountHistory02.findAll", query = "SELECT a FROM AccountHistory02 a"),
    @NamedQuery(name = "AccountHistory02.findByAccountHistoryId", query = "SELECT a FROM AccountHistory02 a WHERE a.accountHistoryId = :accountHistoryId"),
    @NamedQuery(name = "AccountHistory02.findByLinkTokenId", query = "SELECT a FROM AccountHistory02 a WHERE a.linkTokenId = :linkTokenId"),
    @NamedQuery(name = "AccountHistory02.findByAccountType", query = "SELECT a FROM AccountHistory02 a WHERE a.accountType = :accountType"),
    @NamedQuery(name = "AccountHistory02.findByAllocationType", query = "SELECT a FROM AccountHistory02 a WHERE a.allocationType = :allocationType"),
    @NamedQuery(name = "AccountHistory02.findByBankName", query = "SELECT a FROM AccountHistory02 a WHERE a.bankName = :bankName"),
    @NamedQuery(name = "AccountHistory02.findByCurrency", query = "SELECT a FROM AccountHistory02 a WHERE a.currency = :currency"),
    @NamedQuery(name = "AccountHistory02.findByRoutingNumber", query = "SELECT a FROM AccountHistory02 a WHERE a.routingNumber = :routingNumber"),
    @NamedQuery(name = "AccountHistory02.findByCreatedAt", query = "SELECT a FROM AccountHistory02 a WHERE a.createdAt = :createdAt"),
    @NamedQuery(name = "AccountHistory02.findByUpdatedAt", query = "SELECT a FROM AccountHistory02 a WHERE a.updatedAt = :updatedAt"),
    @NamedQuery(name = "AccountHistory02.findByAccountNumber", query = "SELECT a FROM AccountHistory02 a WHERE a.accountNumber = :accountNumber"),
    @NamedQuery(name = "AccountHistory02.findByAccountStatus", query = "SELECT a FROM AccountHistory02 a WHERE a.accountStatus = :accountStatus"),
    @NamedQuery(name = "AccountHistory02.findByAddedBy", query = "SELECT a FROM AccountHistory02 a WHERE a.addedBy = :addedBy"),
    @NamedQuery(name = "AccountHistory02.findByAddedOn", query = "SELECT a FROM AccountHistory02 a WHERE a.addedOn = :addedOn"),
    @NamedQuery(name = "AccountHistory02.findByReason", query = "SELECT a FROM AccountHistory02 a WHERE a.reason = :reason")})
public class AccountHistory02 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "account_history_id", nullable = false)
    private Long accountHistoryId;
    @Column(name = "link_token_id", length = 50)
    private String linkTokenId;
    @Column(name = "account_type", length = 15)
    private String accountType;
    @Column(name = "allocation_type", length = 10)
    private String allocationType;
    @Column(name = "bank_name", length = 50)
    private String bankName;
    @Column(name = "currency", length = 10)
    private String currency;
    @Column(name = "routing_number")
    private Integer routingNumber;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "account_number", length = 20)
    private String accountNumber;
    @Column(name = "account_status", length = 15)
    private String accountStatus;
    @Column(name = "added_by", length = 25)
    private String addedBy;
    @Column(name = "added_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedOn;
    @Column(name = "reason", length = 200)
    private String reason;
    @JoinColumns({
        @JoinColumn(name = "account_identifier", referencedColumnName = "account_identifier"),
        @JoinColumn(name = "pw_account_id", referencedColumnName = "pw_account_id")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Account02 account02;

    public AccountHistory02() {
    }

    public AccountHistory02(Long accountHistoryId) {
        this.accountHistoryId = accountHistoryId;
    }

    public Long getAccountHistoryId() {
        return accountHistoryId;
    }

    public void setAccountHistoryId(Long accountHistoryId) {
        this.accountHistoryId = accountHistoryId;
    }

    public String getLinkTokenId() {
        return linkTokenId;
    }

    public void setLinkTokenId(String linkTokenId) {
        this.linkTokenId = linkTokenId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAllocationType() {
        return allocationType;
    }

    public void setAllocationType(String allocationType) {
        this.allocationType = allocationType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(Integer routingNumber) {
        this.routingNumber = routingNumber;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public Date getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Account02 getAccount02() {
        return account02;
    }

    public void setAccount02(Account02 account02) {
        this.account02 = account02;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountHistoryId != null ? accountHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountHistory02)) {
            return false;
        }
        AccountHistory02 other = (AccountHistory02) object;
        if ((this.accountHistoryId == null && other.accountHistoryId != null) || (this.accountHistoryId != null && !this.accountHistoryId.equals(other.accountHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.myapppp.AccountHistory02[ accountHistoryId=" + accountHistoryId + " ]";
    }
    
}
