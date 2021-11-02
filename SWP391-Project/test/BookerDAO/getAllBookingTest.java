/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookerDAO;

import dal.BookerDAO;
import java.util.List;
import model.Booking;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class getAllBookingTest {
     @Test
    public void testGetAllBookingTestCase1() {
        int uid = 2;
        String search = null;
        String status = "0";
        String orderBy = "0";
        BookerDAO instance = new BookerDAO();
        List<Booking> result = instance.getAllBooking(uid, search, status, orderBy);
        assertNotEquals(0, result.size());
    }
     @Test
    public void testGetAllBookingTestCase2() {
        int uid = 2;
        String search = "";
        String status = "0";
        String orderBy = "0";
        BookerDAO instance = new BookerDAO();
        List<Booking> result = instance.getAllBooking(uid, search, status, orderBy);
        assertNotEquals(0, result.size());
    }
     @Test
    public void testGetAllBookingTestCase3() {
        int uid = 2;
        String search = "home";
        String status = "0";
        String orderBy = "0";
        BookerDAO instance = new BookerDAO();
        List<Booking> result = instance.getAllBooking(uid, search, status, orderBy);
        assertNotEquals(0, result.size());
    }
     @Test
    public void testGetAllBookingTestCase4() {
        int uid = 2;
        String search = null;
        String status = "processing";
        String orderBy = "0";
        BookerDAO instance = new BookerDAO();
        List<Booking> result = instance.getAllBooking(uid, search, status, orderBy);
        assertNotEquals(0, result.size());
    }
     @Test
    public void testGetAllBookingTestCase5() {
        int uid = 2;
        String search = null;
        String status = "0";
        String orderBy = "price";
        BookerDAO instance = new BookerDAO();
        List<Booking> result = instance.getAllBooking(uid, search, status, orderBy);
        assertNotEquals(0, result.size());
    }
      @Test
    public void testGetAllBookingTestCase6() {
        int uid = 1;
        String search = null;
        String status = "0";
        String orderBy = "0";
        BookerDAO instance = new BookerDAO();
        List<Booking> result = instance.getAllBooking(uid, search, status, orderBy);
        assertEquals(0, result.size());
    }
    
}
