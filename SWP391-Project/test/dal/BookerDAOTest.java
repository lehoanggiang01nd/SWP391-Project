/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.List;
import model.Booking;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class BookerDAOTest {
    
    public BookerDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetAllBooking() {
        System.out.println("getAllBooking");
        int uid = 0;
        String search = "";
        String status = "";
        String orderBy = "";
        BookerDAO instance = new BookerDAO();
        List<Booking> expResult = null;
        List<Booking> result = instance.getAllBooking(uid, search, status, orderBy);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BookerDAO.main(args);
        fail("The test case is a prototype.");
    }
    
}
