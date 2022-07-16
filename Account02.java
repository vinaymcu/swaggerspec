/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myapppp;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author 003H4T744
 */
@Entity
@Table(name = "account02", catalog = "mydb1", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"pw_account_id"}),
    @UniqueConstraint(columnNames = {"account_identifier"})})
@NamedQueries({
    @NamedQuery(name = "Account02.findAll", query = "SELECT a FROM Account02 a"),
    @NamedQuery(name = "Account02.findByAccountIdentifier", query = "SELECT a FROM Account02 a WHERE a.account02PK.accountIdentifier = :accountIdentifier"),
    @NamedQuery(name = "Account02.findByPwAccountId", query = "SELECT a FROM Account02 a WHERE a.account02PK.pwAccountId = :pwAccountId"),
    @NamedQuery(name = "Account02.findByLinkTokenId", query = "SELECT a FROM Account02 a WHERE a.linkTokenId = :linkTokenId"),
    @NamedQuery(name = "Account02.findByAccountType", query = "SELECT a FROM Account02 a WHERE a.accountType = :accountType"),
    @NamedQuery(name = "Account02.findByAllocationType", query = "SELECT a FROM Account02 a WHERE a.allocationType = :allocationType"),
    @NamedQuery(name = "Account02.findByBankName", query = "SELECT a FROM Account02 a WHERE a.bankName = :bankName"),
    @NamedQuery(name = "Account02.findByCurrency", query = "SELECT a FROM Account02 a WHERE a.currency = :currency"),
    @NamedQuery(name = "Account02.findByRoutingNumber", query = "SELECT a FROM Account02 a WHERE a.routingNumber = :routingNumber"),
    @NamedQuery(name = "Account02.findByCreatedAt", query = "SELECT a FROM Account02 a WHERE a.createdAt = :createdAt"),
    @NamedQuery(name = "Account02.findByUpdatedAt", query = "SELECT a FROM Account02 a WHERE a.updatedAt = :updatedAt"),
    @NamedQuery(name = "Account02.findByAccountNumber", query = "SELECT a FROM Account02 a WHERE a.accountNumber = :accountNumber"),
    @NamedQuery(name = "Account02.findByAccountStatus", query = "SELECT a FROM Account02 a WHERE a.accountStatus = :accountStatus")})
public class Account02 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Account02PK account02PK;
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
    @OneToMany(mappedBy = "account02", fetch = FetchType.LAZY)
    private Collection<AccountHistory02> accountHistory02Collection;

    public Account02() {
    }

    public Account02(Account02PK account02PK) {
        this.account02PK = account02PK;
    }

    public Account02(long accountIdentifier, String pwAccountId) {
        this.account02PK = new Account02PK(accountIdentifier, pwAccountId);
    }

    public Account02PK getAccount02PK() {
        return account02PK;
    }

    public void setAccount02PK(Account02PK account02PK) {
        this.account02PK = account02PK;
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

    public Collection<AccountHistory02> getAccountHistory02Collection() {
        return accountHistory02Collection;
    }

    public void setAccountHistory02Collection(Collection<AccountHistory02> accountHistory02Collection) {
        this.accountHistory02Collection = accountHistory02Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (account02PK != null ? account02PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account02)) {
            return false;
        }
        Account02 other = (Account02) object;
        if ((this.account02PK == null && other.account02PK != null) || (this.account02PK != null && !this.account02PK.equals(other.account02PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.myapppp.Account02[ account02PK=" + account02PK + " ]";
    }
    
}
