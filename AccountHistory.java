/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myapppp;

import java.io.Serializable;
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

/**
 *
 * @author 003H4T744
 */
@Entity
@Table(name = "account_history", catalog = "mydb1", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AccountHistory.findAll", query = "SELECT a FROM AccountHistory a"),
    @NamedQuery(name = "AccountHistory.findByAccountHistoryId", query = "SELECT a FROM AccountHistory a WHERE a.accountHistoryId = :accountHistoryId"),
    @NamedQuery(name = "AccountHistory.findByPhone", query = "SELECT a FROM AccountHistory a WHERE a.phone = :phone"),
    @NamedQuery(name = "AccountHistory.findByHmail", query = "SELECT a FROM AccountHistory a WHERE a.hmail = :hmail")})
public class AccountHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "account_history_id", nullable = false)
    private Integer accountHistoryId;
    @Column(name = "phone", length = 15)
    private String phone;
    @Column(name = "hmail", length = 100)
    private String hmail;
    @JoinColumns({
        @JoinColumn(name = "identifier", referencedColumnName = "identifier"),
        @JoinColumn(name = "pw_pinwheel_account", referencedColumnName = "pw_pinwheel_account", nullable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account account;

    public AccountHistory() {
    }

    public AccountHistory(Integer accountHistoryId) {
        this.accountHistoryId = accountHistoryId;
    }

    public Integer getAccountHistoryId() {
        return accountHistoryId;
    }

    public void setAccountHistoryId(Integer accountHistoryId) {
        this.accountHistoryId = accountHistoryId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHmail() {
        return hmail;
    }

    public void setHmail(String hmail) {
        this.hmail = hmail;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
        if (!(object instanceof AccountHistory)) {
            return false;
        }
        AccountHistory other = (AccountHistory) object;
        if ((this.accountHistoryId == null && other.accountHistoryId != null) || (this.accountHistoryId != null && !this.accountHistoryId.equals(other.accountHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.myapppp.AccountHistory[ accountHistoryId=" + accountHistoryId + " ]";
    }
    
}
