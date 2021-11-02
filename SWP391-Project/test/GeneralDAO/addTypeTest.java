/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralDAO;

import dal.GeneralDAO;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class addTypeTest {

    public addTypeTest() {
    }
    
    GeneralDAO instance = new GeneralDAO();
      @Test
    public void testAddTYpeNull() {
       String pName = null;
        String pimg = "villa.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(0, result);
    }
    @Test
    public void testAddTypeImgNull() {
       String pName = "Villa";
        String pimg = null;
        int result = instance.AddPlace(pName, pimg);
        assertEquals(1, result);
    }
    @Test
    public void testAddTypeEmpty() {
       String pName = "";
        String pimg = "villa.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(0, result);
    }
    @Test
    public void testAddTypeImgEmpty() {
       String pName = null;
        String pimg = "villa.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(1, result);
    }
    @Test
    public void testAddTypeValid() {
       String pName = "Villa";
        String pimg = "villa.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(1, result);
    }
    @Test
     public void testAddTypeDuplicate() {
       String pName = "Villa";
        String pimg = "duplicate.jpg";
        int result = instance.AddPlace(pName, pimg);
        assertEquals(0, result);
    }
    
}
