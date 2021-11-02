/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Place;
import model.Room;
import model.Type;
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
public class GeneralDAOTest {
    
    public GeneralDAOTest() {
    }
    

    @Test
    public void testGetAllPlace() {
        System.out.println("getAllPlace");
        GeneralDAO instance = new GeneralDAO();
        ArrayList<Place> expResult = null;
        ArrayList<Place> result = instance.getAllPlace();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAllType() {
        System.out.println("getAllType");
        GeneralDAO instance = new GeneralDAO();
        ArrayList<Type> expResult = null;
        ArrayList<Type> result = instance.getAllType();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGet6Room() {
        System.out.println("get6Room");
        GeneralDAO instance = new GeneralDAO();
        ArrayList<Room> expResult = null;
        ArrayList<Room> result = instance.get6Room();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchRoom() {
        System.out.println("searchRoom");
        String placeId = "";
        String typeId = "";
        String bedNum = "";
        String search = "";
        String orderBy = "";
        GeneralDAO instance = new GeneralDAO();
        List<Room> expResult = null;
        List<Room> result = instance.searchRoom(placeId, typeId, bedNum, search, orderBy);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddPlace() {
        System.out.println("AddPlace");
        String pName = "";
        String pimg = "";
        GeneralDAO instance = new GeneralDAO();
        int expResult = 0;
        int result = instance.AddPlace(pName, pimg);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddType() {
        System.out.println("AddType");
        String tName = "";
        String timg = "";
        GeneralDAO instance = new GeneralDAO();
        int expResult = 0;
        int result = instance.AddType(tName, timg);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    
}
