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
public class AccountPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "identifier", nullable = false)
    private int identifier;
    @Basic(optional = false)
    @Column(name = "pw_pinwheel_account", nullable = false, length = 255)
    private String pwPinwheelAccount;

    public AccountPK() {
    }

    public AccountPK(int identifier, String pwPinwheelAccount) {
        this.identifier = identifier;
        this.pwPinwheelAccount = pwPinwheelAccount;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getPwPinwheelAccount() {
        return pwPinwheelAccount;
    }

    public void setPwPinwheelAccount(String pwPinwheelAccount) {
        this.pwPinwheelAccount = pwPinwheelAccount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) identifier;
        hash += (pwPinwheelAccount != null ? pwPinwheelAccount.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountPK)) {
            return false;
        }
        AccountPK other = (AccountPK) object;
        if (this.identifier != other.identifier) {
            return false;
        }
        if ((this.pwPinwheelAccount == null && other.pwPinwheelAccount != null) || (this.pwPinwheelAccount != null && !this.pwPinwheelAccount.equals(other.pwPinwheelAccount))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.myapppp.AccountPK[ identifier=" + identifier + ", pwPinwheelAccount=" + pwPinwheelAccount + " ]";
    }
    
}
