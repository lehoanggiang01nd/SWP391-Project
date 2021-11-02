/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomDAO;

import dal.roomDAO;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class updateRoomTest {

    roomDAO instance = new roomDAO();

    @Test
    public void testUpdateRoomTestCase1() {
        System.out.println("updateRoom");
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result=instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(1, result);
    }

    @Test
    public void testUpdateRoomTestCase2() {
        System.out.println("updateRoom");
        String rname = null;
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase3() {
        System.out.println("updateRoom");
        String rname = "";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase4() {
        System.out.println("updateRoom");
        String rname = "Homestay";
        String desc = "";
        String owner = "1";
        Boolean status = false;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(1, result);
    }

    @Test
    public void testUpdateRoomTestCase5() {
        System.out.println("updateRoom");
        String rname = "Homestay";
        String desc = "Homestay in Sapa";
        String owner = null;
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase6() {
        System.out.println("updateRoom");
        String rname = "Homestay";
        String desc = null;
        String owner = "";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase7() {
        System.out.println("updateRoom");
        String rname = "Homestay";
        String desc = null;
        String owner = "a";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase8() {
        System.out.println("updateRoom");
        String rname = "Homestay";
        String desc = null;
        String owner = "-1";
        Boolean status = true;
        String area = null;
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase9() {
        System.out.println("updateRoom");
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = null;
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase10() {
        System.out.println("updateRom");
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase11() {
        System.out.println("updateRoom");
        String rname = null;
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12asd";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
    
    @Test
    public void testUpdateRoomTestCase12() {
        System.out.println("updateRoom");
        String rname = null;
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "-12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase13() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = null;
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase14() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
    @Test
    public void testUpdateRoomTestCase15() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "asd";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase16() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "-2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }

    @Test
    public void testUpdateRoomTestCase17() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = null;
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase18() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase19() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "asd";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase20() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "1";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(1, result);
    }
@Test
    public void testUpdateRoomTestCase21() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "-123";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase22() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = null;
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase23() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase24() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "a";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase25() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "0";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(1, result);
    }
@Test
    public void testUpdateRoomTestCase26() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "-1";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase27() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = "";
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase28() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = "a";
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase29() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = "";
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase30() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "a";
        String placeID = null;
        String typeID = null;
        int id = 7;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase31() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 1;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(0, result);
    }
@Test
    public void testUpdateRoomTestCase32() {
        String rname = "Homestay";
        String desc = null;
        String owner = "1";
        Boolean status = true;
        String area = "12";
        String bednum = "2";
        String price = "123456";
        String rating = "4.5";
        String placeID = null;
        String typeID = null;
        int id = 5;
        int result = instance.updateRoom(rname, desc, owner, status, area, bednum, price, rating, placeID, typeID, id);
        assertEquals(1, result);
    }

}
