/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralDAO;

import dal.GeneralDAO;
import java.util.ArrayList;
import model.Place;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class getAllPlaceTest {

    public getAllPlaceTest() {
    }
    
    @Test
    public void testGetAllPlace() {
        GeneralDAO instance = new GeneralDAO();
        ArrayList<Place> result = instance.getAllPlace();
        assertNotEquals(0, result.size());
    }

}
