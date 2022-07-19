package com.app.h2db.entity;

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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "identity02")
public class Identity02 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "identity_id")
    private Integer identityId;
    @Column(name = "link_token_id")
    private String linkTokenId;
    @Column(name = "end_user_id")
    private String endUserId;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "last_four_ssn")
    private Integer lastFourSsn;
    @Column(name = "emails")
    private String emails;
    @JoinColumn(name = "pw_account_id", referencedColumnName = "pw_account_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Account02 pwAccountId;

    public Identity02() {
    }

    public Identity02(Integer identityId) {
        this.identityId = identityId;
    }

    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public String getLinkTokenId() {
        return linkTokenId;
    }

    public void setLinkTokenId(String linkTokenId) {
        this.linkTokenId = linkTokenId;
    }

    public String getEndUserId() {
        return endUserId;
    }

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getLastFourSsn() {
        return lastFourSsn;
    }

    public void setLastFourSsn(Integer lastFourSsn) {
        this.lastFourSsn = lastFourSsn;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public Account02 getPwAccountId() {
        return pwAccountId;
    }

    public void setPwAccountId(Account02 pwAccountId) {
        this.pwAccountId = pwAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identityId != null ? identityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Identity02)) {
            return false;
        }
        Identity02 other = (Identity02) object;
        if ((this.identityId == null && other.identityId != null) || (this.identityId != null && !this.identityId.equals(other.identityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Identity02{" +
                "identityId=" + identityId +
                ", linkTokenId='" + linkTokenId + '\'' +
                ", endUserId='" + endUserId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", lastFourSsn=" + lastFourSsn +
                ", emails='" + emails + '\'' +
                '}';
    }
}
