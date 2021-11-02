/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomDAO;

import dal.roomDAO;
import model.Room;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class getRoomByIDTest {
     @Test
    public void testGetRoomByIDTestCase1() {
        System.out.println("getRoomByID");
        int id = 5;
        roomDAO instance = new roomDAO();
        Room result = instance.getRoomByID(id);
        assertNotNull(result);
    }
     @Test
    public void testGetRoomByIDTestCase2() {
        System.out.println("getRoomByID");
        int id = -5;
        roomDAO instance = new roomDAO();
        Room result = instance.getRoomByID(id);
        assertNull(result);
    }
     @Test
    public void testGetRoomByIDTestCase3() {
        System.out.println("getRoomByID");
        int id = 7;
        roomDAO instance = new roomDAO();
        Room result = instance.getRoomByID(id);
        assertNotNull(result);
    }
}
