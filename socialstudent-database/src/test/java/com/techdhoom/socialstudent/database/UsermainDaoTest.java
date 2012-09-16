/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.ContextConfiguration;
import com.techdhoom.socialstudent.database.config.DatabaseApplicationConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.techdhoom.socialstudent.model.Usermain;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tapan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class, classes={DatabaseApplicationConfig.class})
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional

public class UsermainDaoTest {
     @Autowired
    UsermainDao usermainDao;

    public UsermainDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createUsermain method, of class UsermainDao.
     */
    @Test
    public void testCreateUsermain() {
        System.out.println("createUsermain");
        Usermain usermain = new Usermain();
        usermain.setUsername("tapan");
         Long result = usermainDao.create(usermain);
        System.out.println("\n\t---"+result);
    }

   
}
