///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
package com.techdhoom.socialstudent.database;
//
//import com.techdhoom.socialstudent.model.Groups;
//import com.techdhoom.socialstudent.model.Users;
//import java.util.List;
//import org.hibernate.criterion.Criterion;
//import org.junit.*;
//import static org.junit.Assert.*;
//
///**
// *
// * @author SONY
// */
public class UsersDaoTest {
//    
//    public UsersDaoTest() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of createEventmaster method, of class UsersDao.
//     */
//    @Test
//    public void testCreateEventmaster() {
//        System.out.println("createEventmaster");
//        Users users = null;
//        UsersDao instance = new UsersDaoImpl();
//        Long expResult = null;
//        Long result = instance.createUser(users);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateEventmaster method, of class UsersDao.
//     */
//    @Test
//    public void testUpdateEventmaster() {
//        System.out.println("updateEventmaster");
//        Users users = null;
//        UsersDao instance = new UsersDaoImpl();
//        Long expResult = null;
//        Long result = instance.updateEventmaster(users);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteEventmaster method, of class UsersDao.
//     */
//    @Test
//    public void testDeleteEventmaster() {
//        System.out.println("deleteEventmaster");
//        Users users = null;
//        UsersDao instance = new UsersDaoImpl();
//        Long expResult = null;
//        Long result = instance.deleteEventmaster(users);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of retrievebyidEventmaster method, of class UsersDao.
//     */
//    @Test
//    public void testRetrievebyidEventmaster() {
//        System.out.println("retrievebyidEventmaster");
//        Users users = null;
//        UsersDao instance = new UsersDaoImpl();
//        Long expResult = null;
//        Long result = instance.retrievebyidEventmaster(users);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of retrieveallEventmaster method, of class UsersDao.
//     */
//    @Test
//    public void testRetrieveallEventmaster() {
//        System.out.println("retrieveallEventmaster");
//        Users users = null;
//        UsersDao instance = new UsersDaoImpl();
//        Long expResult = null;
//        Long result = instance.retrieveallEventmaster(users);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//   public class UsersDaoImpl implements UsersDao {
//
//        @Override
//        public Long createUser(Users users) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public Long updateEventmaster(Users users) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public Long deleteEventmaster(Users users) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public Long retrievebyidEventmaster(Users users) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public Long retrieveallEventmaster(Users users) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Groups> retriveAll() {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Groups> groupShow() {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public Users retrieveById(Long id) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public Long create(Users entity) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public void createOrUpdate(Users entity) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public void update(Users entity) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public void delete(Users entity) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public void deleteById(Long id) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> retrieveAll() {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> findAll(String orderBy) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> findFiltered(String property, Object filter) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> findFiltered(String property, Object filter, String orderBy) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> findLikeFiltered(String property, Object filter) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> findLikeFiltered(String property, Object filter, String orderBy) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public Users findUniqueFiltered(String property, Object filter) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public Users findUniqueFiltered(String property, Object filter, String orderBy) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> findByCriteria(Criterion... criterion) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> findByCriteriaList(List<Criterion> criterions) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> findByCriteriaList(List<Criterion> criterions, Boolean isSearch) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> findByExample(Users entity) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> groupShow() {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        @Override
//        public List<Users> groupShow() {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//     
//}
}
