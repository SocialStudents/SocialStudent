/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.UsermainDao;
import com.techdhoom.socialstudent.model.Usermain;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class UsermainDaoImpl extends BaseAbstractGenericDao<Usermain, Long> implements UsermainDao{
     @Override
    public Long createUsermain(Usermain usermain) {
        return super.create(usermain);
    }

    @Override
    public Long updateUsermain(Usermain usermain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteUsermain(Usermain usermain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidUsermain(Usermain usermain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallUsermain(Usermain usermain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
