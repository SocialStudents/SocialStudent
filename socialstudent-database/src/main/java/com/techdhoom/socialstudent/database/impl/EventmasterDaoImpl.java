/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.EventmasterDao;
import com.techdhoom.socialstudent.model.Eventmaster;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class EventmasterDaoImpl extends BaseAbstractGenericDao<Eventmaster, Long> implements EventmasterDao {

    @Override
    public Long createEventmaster(Eventmaster eventmaster) {
        return super.create(eventmaster);
    }

    @Override
    public Long updateEventmaster(Eventmaster eventmaster) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteEventmaster(Eventmaster eventmaster) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidEventmaster(Eventmaster eventmaster) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallEventmaster(Eventmaster eventmaster) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
