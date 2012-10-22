/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.model.Status;
import java.util.List;
import org.hibernate.criterion.Criterion;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author SONY
 */
public class StatusDaoTest {
    
    public StatusDaoTest() {
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
     * Test of createStatus method, of class StatusDao.
     */
    @Test
    public void testCreateStatus() {
        System.out.println("createStatus");
        Status status = null;
        StatusDao instance = new StatusDaoImpl();
        Long expResult = null;
        Long result = instance.createStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStatus method, of class StatusDao.
     */
    @Test
    public void testUpdateStatus() {
        System.out.println("updateStatus");
        Status status = null;
        StatusDao instance = new StatusDaoImpl();
        Long expResult = null;
        Long result = instance.updateStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStatus method, of class StatusDao.
     */
    @Test
    public void testDeleteStatus() {
        System.out.println("deleteStatus");
        Status status = null;
        StatusDao instance = new StatusDaoImpl();
        Long expResult = null;
        Long result = instance.deleteStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrievebyidStatus method, of class StatusDao.
     */
    @Test
    public void testRetrievebyidStatus() {
        System.out.println("retrievebyidStatus");
        Status status = null;
        StatusDao instance = new StatusDaoImpl();
        Long expResult = null;
        Long result = instance.retrievebyidStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveallStatus method, of class StatusDao.
     */
    @Test
    public void testRetrieveallStatus() {
        System.out.println("retrieveallStatus");
        Status status = null;
        StatusDao instance = new StatusDaoImpl();
        Long expResult = null;
        Long result = instance.retrieveallStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class StatusDaoImpl implements StatusDao {

        public Long createStatus(Status status) {
            return null;
        }

        public Long updateStatus(Status status) {
            return null;
        }

        public Long deleteStatus(Status status) {
            return null;
        }

        public Long retrievebyidStatus(Status status) {
            return null;
        }

        public Long retrieveallStatus(Status status) {
            return null;
        }

        @Override
        public Status retrieveById(Long id) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Long create(Status entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void createOrUpdate(Status entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void update(Status entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void delete(Status entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void deleteById(Long id) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> retrieveAll() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> findAll(String orderBy) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> findFiltered(String property, Object filter) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> findFiltered(String property, Object filter, String orderBy) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> findLikeFiltered(String property, Object filter) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> findLikeFiltered(String property, Object filter, String orderBy) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Status findUniqueFiltered(String property, Object filter) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Status findUniqueFiltered(String property, Object filter, String orderBy) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> findByCriteria(Criterion... criterion) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> findByCriteriaList(List<Criterion> criterions) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> findByCriteriaList(List<Criterion> criterions, Boolean isSearch) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Status> findByExample(Status entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
