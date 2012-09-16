/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.GroupmasterDao;
import com.techdhoom.socialstudent.model.Groupmaster;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class GroupmasterDaoImpl extends BaseAbstractGenericDao<Groupmaster, Long> implements GroupmasterDao {

    @Override
    public Long createGroupmaster(Groupmaster groupmaster) {
        return super.create(groupmaster);
    }

    @Override
    public Long updateGroupmaster(Groupmaster groupmaster) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteGroupmaster(Groupmaster groupmaster) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidGroupmaster(Groupmaster groupmaster) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallGroupmaster(Groupmaster groupmaster) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
