/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Feed;
import com.techdhoom.socialstudent.model.Status;
import java.io.Serializable;

/**
 *
 * @author SONY
 */
public interface StatusDao extends GenericDao<Status, Long> {
     public Long createStatus(Status status);
      public Long updateStatus(Status status);
       public Long deleteStatus(Status status);
        public Long retrievebyidStatus(Status status);
         public Long retrieveallStatus(Status status);
    
}
