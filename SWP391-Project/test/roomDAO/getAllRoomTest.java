/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomDAO;

import dal.roomDAO;
import java.util.List;
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
public class getAllRoomTest {
      @Test
    public void testGetAllRoom() {
        roomDAO instance = new roomDAO();
        List<Room> result = instance.getAllRoom();
        assertNotNull(result);
    }
}
