/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.UserCore;
import com.techdhoom.socialstudent.core.impl.UserCoreImpl;
import com.techdhoom.socialstudent.model.Users;
import com.techdhoom.socialstudent.web.databean.UsersDataBean;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author SONY
 */
@ManagedBean
@SessionScoped
public class UsersServiceBean {
    @ManagedProperty (value="#{usersDataBean}")
    UsersDataBean usersDataBean;

    public UsersServiceBean() {
    }

    public UsersServiceBean(UsersDataBean usersDataBean) {
        this.usersDataBean = usersDataBean;
    }

    public UsersDataBean getUsersDataBean() {
        return usersDataBean;
    }

    public void setUsersDataBean(UsersDataBean usersDataBean) {
        this.usersDataBean = usersDataBean;
    }
    
    public List<Users> retriveUsers(){
        //List<Users> userslist=new ArrayList<Users>();
       
        UserCore userCore=new UserCoreImpl();
        System.out.println(userCore);
        return userCore.retrieveAllUsers();
    }
    
}
