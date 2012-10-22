/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.StatusDao;
import com.techdhoom.socialstudent.model.Status;
import java.io.Serializable;

/**
 *
 * @author SONY
 */
public class StatusDaoImpl extends BaseAbstractGenericDao<Status, Long> implements StatusDao{

    @Override
    public Long createStatus(Status status) {
    return super.create(status);   
    }

    @Override
    public Long updateStatus(Status status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteStatus(Status status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidStatus(Status status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallStatus(Status status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
}
