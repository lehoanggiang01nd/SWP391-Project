/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.List;
import model.Room;
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
public class roomDAOTest {
    
    public roomDAOTest() {
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
    public void testGetAllRoom() {
        System.out.println("getAllRoom");
        roomDAO instance = new roomDAO();
        List<Room> expResult = null;
        List<Room> result = instance.getAllRoom();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRoomByID() {
        System.out.println("getRoomByID");
        int id = 0;
        roomDAO instance = new roomDAO();
        Room expResult = null;
        Room result = instance.getRoomByID(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateRoom() {
        System.out.println("updateRoom");
        String rname = "";
        String desc = "";
        String owner = "";
        Boolean status = null;
        String area = "";
        String bednum = "";
        String price = "";
        String rating = "";
        String placeID = "";
        String typeID = "";
        int id = 0;
        roomDAO instance = new roomDAO();
        instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        roomDAO.main(args);
        fail("The test case is a prototype.");
    }
    
}
