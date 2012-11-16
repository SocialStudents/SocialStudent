/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.UserCore;
import com.techdhoom.socialstudent.core.UsermainCore;
import com.techdhoom.socialstudent.model.Usermain;
import com.techdhoom.socialstudent.model.Users;
import com.techdhoom.socialstudent.web.databean.UsermainDatabean;
import com.techdhoom.socialstudent.web.databean.UsersDataBean;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author krunal
 */
@ManagedBean
public class UsermainServicebean {
    
    @ManagedProperty(value = "#{usermainDatabean}")
    private UsermainDatabean usermainDatabean;
    @ManagedProperty(value = "#{usermainCore}")
    public UsermainCore usermainCore;
    List<UsermainDatabean> usermainDatabeanlist;

    public UsermainServicebean() {
    }

    public UsermainServicebean(UsermainDatabean usermainDatabean, UsermainCore usermainCore, List<UsermainDatabean> usermainDatabeanlist) {
        this.usermainDatabean = usermainDatabean;
        this.usermainCore = usermainCore;
        this.usermainDatabeanlist = usermainDatabeanlist;
    }

    public UsermainCore getUsermainCore() {
        return usermainCore;
    }

    public void setUsermainCore(UsermainCore usermainCore) {
        this.usermainCore = usermainCore;
    }

    public UsermainDatabean getUsermainDatabean() {
        return usermainDatabean;
    }

    public void setUsermainDatabean(UsermainDatabean usermainDatabean) {
        this.usermainDatabean = usermainDatabean;
    }

    public List<UsermainDatabean> getUsermainDatabeanlist() {
       
        return usermainDatabeanlist;
    }
   

    public void setUsermainDatabeanlist(List<UsermainDatabean> usermainDatabeanlist) {
        this.usermainDatabeanlist = usermainDatabeanlist;
    }
   public void retriveAllUsermain(){
   
         this.setUsermainDatabeanlist(new ArrayList<UsermainDatabean>());
         for(Usermain  usermain:usermainCore.retrieveAllUsermain()){
             UsermainDatabean usermainData=new  UsermainDatabean(null,null,null,null,usermain.getUsername(),null,null,null, null);
            this.usermainDatabeanlist.add(usermainData);
         }
        
       
        
   
   
   }
   
    }

