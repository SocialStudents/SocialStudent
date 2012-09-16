/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Group;

/**
 *
 * @author tapan
 */
public interface GroupDao extends GenericDao<Group, Long> {
     public Long createGroup(Group group);
   public Long updateGroup(Group group);
   public Long deleteGroup(Group group);
   public Long retrievebyidGroup(Group group);
   public Long retrieveallGroup(Group group);
    
}
