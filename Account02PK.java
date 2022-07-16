/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myapppp;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author 003H4T744
 */
@Embeddable
public class Account02PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "account_identifier", nullable = false)
    private long accountIdentifier;
    @Basic(optional = false)
    @Column(name = "pw_account_id", nullable = false, length = 50)
    private String pwAccountId;

    public Account02PK() {
    }

    public Account02PK(long accountIdentifier, String pwAccountId) {
        this.accountIdentifier = accountIdentifier;
        this.pwAccountId = pwAccountId;
    }

    public long getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(long accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public String getPwAccountId() {
        return pwAccountId;
    }

    public void setPwAccountId(String pwAccountId) {
        this.pwAccountId = pwAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) accountIdentifier;
        hash += (pwAccountId != null ? pwAccountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account02PK)) {
            return false;
        }
        Account02PK other = (Account02PK) object;
        if (this.accountIdentifier != other.accountIdentifier) {
            return false;
        }
        if ((this.pwAccountId == null && other.pwAccountId != null) || (this.pwAccountId != null && !this.pwAccountId.equals(other.pwAccountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.myapppp.Account02PK[ accountIdentifier=" + accountIdentifier + ", pwAccountId=" + pwAccountId + " ]";
    }
    
}
