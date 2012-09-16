/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Eventmaster;

/**
 *
 * @author tapan
 */
public interface EventmasterDao extends GenericDao<Eventmaster, Long> {
    public Long createEventmaster(Eventmaster eventmaster);
    public Long updateEventmaster(Eventmaster eventmaster);
    public Long deleteEventmaster(Eventmaster eventmaster);
    public Long retrievebyidEventmaster(Eventmaster eventmaster);
    public Long retrieveallEventmaster(Eventmaster eventmaster);

    
}
