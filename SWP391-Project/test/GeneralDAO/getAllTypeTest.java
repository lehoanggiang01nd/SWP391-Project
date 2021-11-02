/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralDAO;

import dal.GeneralDAO;
import java.util.ArrayList;
import model.Type;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class getAllTypeTest {
     @Test
    public void testGetAllType() {
        System.out.println("getAllType");
        GeneralDAO instance = new GeneralDAO();
        ArrayList<Type> result = instance.getAllType();
        assertNotEquals(0, result.size());
    }

}
