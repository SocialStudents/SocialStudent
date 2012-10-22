/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "usermain")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usermain.findAll", query = "SELECT u FROM Usermain u"),
    @NamedQuery(name = "Usermain.findByUserId", query = "SELECT u FROM Usermain u WHERE u.userId = :userId"),
    @NamedQuery(name = "Usermain.findByUserType", query = "SELECT u FROM Usermain u WHERE u.userType = :userType"),
    @NamedQuery(name = "Usermain.findByUsername", query = "SELECT u FROM Usermain u WHERE u.username = :username"),
    @NamedQuery(name = "Usermain.findByBranch", query = "SELECT u FROM Usermain u WHERE u.branch = :branch"),
    @NamedQuery(name = "Usermain.findByEnrollNo", query = "SELECT u FROM Usermain u WHERE u.enrollNo = :enrollNo"),
    @NamedQuery(name = "Usermain.findByUserlastname", query = "SELECT u FROM Usermain u WHERE u.userlastname = :userlastname"),
    @NamedQuery(name = "Usermain.findByYear", query = "SELECT u FROM Usermain u WHERE u.year = :year")})
public class Usermain implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "username")
    private String username;
    @Column(name = "branch")
    private String branch;
    @Column(name = "enroll_no")
    private Integer enrollNo;
    @Column(name = "userlastname")
    private String userlastname;
    @Column(name = "year")
    private Integer year;
    @OneToMany(mappedBy = "userid")
    private Collection<Status> statusCollection;

    public Usermain() {
    }

    public Usermain(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getEnrollNo() {
        return enrollNo;
    }

    public void setEnrollNo(Integer enrollNo) {
        this.enrollNo = enrollNo;
    }

    public String getUserlastname() {
        return userlastname;
    }

    public void setUserlastname(String userlastname) {
        this.userlastname = userlastname;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @XmlTransient
    public Collection<Status> getStatusCollection() {
        return statusCollection;
    }

    public void setStatusCollection(Collection<Status> statusCollection) {
        this.statusCollection = statusCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usermain)) {
            return false;
        }
        Usermain other = (Usermain) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Usermain[ userId=" + userId + " ]";
    }
    
}
