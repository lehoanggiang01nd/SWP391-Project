/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralDAO;

import dal.GeneralDAO;
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
public class SearchRoomTest {

    GeneralDAO instance = new GeneralDAO();

    @Test
    public void testSearchRoomTestCase1() {
        String placeId = "0";
        String typeId = "0";
        String bedNum = "0";
        String search = null;
        String orderBy = "0";
        List<Room> result = instance.searchRoom(placeId, typeId, bedNum, search, orderBy);
        assertNotNull(result);
    }
     @Test
    public void testSearchRoomTestCase2() {
        String placeId = "0";
        String typeId = "1";
        String bedNum = "0";
        String search = null;
        String orderBy = "0";
        List<Room> result = instance.searchRoom(placeId, typeId, bedNum, search, orderBy);
        assertNotNull(result);
    }
     @Test
    public void testSearchRoomTestCase3() {
        String placeId = "1";
        String typeId = "0";
        String bedNum = "0";
        String search = null;
        String orderBy = "0";
        List<Room> result = instance.searchRoom(placeId, typeId, bedNum, search, orderBy);
        assertNotNull(result);
    }
     @Test
    public void testSearchRoomTestCase4() {
        String placeId = "0";
        String typeId = "0";
        String bedNum = "2";
        String search = null;
        String orderBy = "0";
        List<Room> result = instance.searchRoom(placeId, typeId, bedNum, search, orderBy);
        assertNotNull(result);
    }
     @Test
    public void testSearchRoomTestCase5() {
        String placeId = "0";
        String typeId = "0";
        String bedNum = "0";
        String search = "";
        String orderBy = "price";
        List<Room> result = instance.searchRoom(placeId, typeId, bedNum, search, orderBy);
        assertNotNull(result);
    }
     @Test
    public void testSearchRoomTestCase6() {
        String placeId = "0";
        String typeId = "0";
        String bedNum = "0";
        String search = "home";
        String orderBy = "price";
        List<Room> result = instance.searchRoom(placeId, typeId, bedNum, search, orderBy);
        assertNotNull(result);
    }
     @Test
    public void testSearchRoomTestCase7() {
        String placeId = "2";
        String typeId = "1";
        String bedNum = "0";
        String search = null;
        String orderBy = "0";
        List<Room> result = instance.searchRoom(placeId, typeId, bedNum, search, orderBy);
        assertEquals(0,result.size());
    }
    
}
