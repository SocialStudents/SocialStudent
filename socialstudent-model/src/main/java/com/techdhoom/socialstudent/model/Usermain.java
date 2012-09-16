/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tapan
 */
@Entity
@Table(name = "usermain")
public class Usermain implements Serializable {
    @OneToMany(mappedBy = "userFriendsId")
    private Collection<Friendmanagement> friendmanagementCollection;
    @OneToMany(mappedBy = "userId")
    private Collection<Friendmanagement> friendmanagementCollection1;
    @OneToMany(mappedBy = "eventcreatedBy")
    private Collection<Eventmaster> eventmasterCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "username")
    private String username;
    @Column(name = "user_type")
    private String userType;
    @OneToMany(mappedBy = "userId")
    private Collection<Feedunlike> feedunlikeCollection;
    @OneToMany(mappedBy = "userId")
    private Collection<Groupmember> groupmemberCollection;
    @OneToMany(mappedBy = "userId")
    private Collection<Feedlike> feedlikeCollection;
    @OneToMany(mappedBy = "updatedBy")
    private Collection<Feed> feedCollection;
    @OneToMany(mappedBy = "owner")
    private Collection<Feed> feedCollection1;
    @OneToMany(mappedBy = "loggedperson")
    private Collection<Feed> feedCollection2;
    @OneToMany(mappedBy = "createdBy")
    private Collection<Feed> feedCollection3;
    @OneToMany(mappedBy = "updatedBy")
    private Collection<Group> group1Collection;
    @OneToMany(mappedBy = "createdBy")
    private Collection<Group> group1Collection1;
    @OneToMany(mappedBy = "groupowner")
    private Collection<Group> group1Collection2;
    @OneToMany(mappedBy = "createdBy")
    private Collection<Feedcomment> feedcommentCollection;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @XmlTransient
    public Collection<Feedunlike> getFeedunlikeCollection() {
        return feedunlikeCollection;
    }

    public void setFeedunlikeCollection(Collection<Feedunlike> feedunlikeCollection) {
        this.feedunlikeCollection = feedunlikeCollection;
    }

    @XmlTransient
    public Collection<Groupmember> getGroupmemberCollection() {
        return groupmemberCollection;
    }

    public void setGroupmemberCollection(Collection<Groupmember> groupmemberCollection) {
        this.groupmemberCollection = groupmemberCollection;
    }

    @XmlTransient
    public Collection<Feedlike> getFeedlikeCollection() {
        return feedlikeCollection;
    }

    public void setFeedlikeCollection(Collection<Feedlike> feedlikeCollection) {
        this.feedlikeCollection = feedlikeCollection;
    }

    @XmlTransient
    public Collection<Feed> getFeedCollection() {
        return feedCollection;
    }

    public void setFeedCollection(Collection<Feed> feedCollection) {
        this.feedCollection = feedCollection;
    }

    @XmlTransient
    public Collection<Feed> getFeedCollection1() {
        return feedCollection1;
    }

    public void setFeedCollection1(Collection<Feed> feedCollection1) {
        this.feedCollection1 = feedCollection1;
    }

    @XmlTransient
    public Collection<Feed> getFeedCollection2() {
        return feedCollection2;
    }

    public void setFeedCollection2(Collection<Feed> feedCollection2) {
        this.feedCollection2 = feedCollection2;
    }

    @XmlTransient
    public Collection<Feed> getFeedCollection3() {
        return feedCollection3;
    }

    public void setFeedCollection3(Collection<Feed> feedCollection3) {
        this.feedCollection3 = feedCollection3;
    }

    @XmlTransient
    public Collection<Group> getGroup1Collection() {
        return group1Collection;
    }

    public void setGroup1Collection(Collection<Group> group1Collection) {
        this.group1Collection = group1Collection;
    }

    @XmlTransient
    public Collection<Group> getGroup1Collection1() {
        return group1Collection1;
    }

    public void setGroup1Collection1(Collection<Group> group1Collection1) {
        this.group1Collection1 = group1Collection1;
    }

    @XmlTransient
    public Collection<Group> getGroup1Collection2() {
        return group1Collection2;
    }

    public void setGroup1Collection2(Collection<Group> group1Collection2) {
        this.group1Collection2 = group1Collection2;
    }

    @XmlTransient
    public Collection<Feedcomment> getFeedcommentCollection() {
        return feedcommentCollection;
    }

    public void setFeedcommentCollection(Collection<Feedcomment> feedcommentCollection) {
        this.feedcommentCollection = feedcommentCollection;
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

    @XmlTransient
    public Collection<Friendmanagement> getFriendmanagementCollection() {
        return friendmanagementCollection;
    }

    public void setFriendmanagementCollection(Collection<Friendmanagement> friendmanagementCollection) {
        this.friendmanagementCollection = friendmanagementCollection;
    }

    @XmlTransient
    public Collection<Friendmanagement> getFriendmanagementCollection1() {
        return friendmanagementCollection1;
    }

    public void setFriendmanagementCollection1(Collection<Friendmanagement> friendmanagementCollection1) {
        this.friendmanagementCollection1 = friendmanagementCollection1;
    }

    @XmlTransient
    public Collection<Eventmaster> getEventmasterCollection() {
        return eventmasterCollection;
    }

    public void setEventmasterCollection(Collection<Eventmaster> eventmasterCollection) {
        this.eventmasterCollection = eventmasterCollection;
    }
    
}
