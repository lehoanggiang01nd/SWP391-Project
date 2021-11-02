/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralDAO;

import dal.GeneralDAO;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class addPlaceTest {

    public addPlaceTest() {
    }
    
    GeneralDAO instance = new GeneralDAO();
      @Test
    public void testAddPlaceNull() {
       String pName = null;
        String pimg = "maichau.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(0, result);
    }
    @Test
    public void testAddPlaceImgNull() {
       String pName = "Mai Chau";
        String pimg = null;
        int result = instance.AddPlace(pName, pimg);
        assertEquals(1, result);
    }
    @Test
    public void testAddPlaceEmpty() {
       String pName = "";
        String pimg = "maichau.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(0, result);
    }
    @Test
    public void testAddPlaceImgEmpty() {
       String pName = null;
        String pimg = "maichau.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(1, result);
    }
    @Test
    public void testAddPlaceValid() {
       String pName = "MaiChau";
        String pimg = "maichau.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(1, result);
    }
    @Test
     public void testAddPlaceDaplicate() {
       String pName = "MaiChau";
        String pimg = "duplicateplace.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(0, result);
    }
    
}
