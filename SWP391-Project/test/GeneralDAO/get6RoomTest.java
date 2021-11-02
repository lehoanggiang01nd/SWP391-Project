/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralDAO;

import dal.GeneralDAO;
import java.util.ArrayList;
import model.Room;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class get6RoomTest {
    
    @Test
    public void testGet6Room() {
        GeneralDAO instance = new GeneralDAO();
        ArrayList<Room> result = instance.get6Room();
        assertEquals(6, result.size());
    }
}
