
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryTest {
    private Inventory inv1;
    
    public InventoryTest()
    {
    }
    
    @Before
    public void setUp() 
    {
        inv1 = new Inventory(2);
    }
    
    @After
    public void tearDown() {
        inv1 = null;
    }

    @Test
    public void testSetSize() {
     assertEquals(3, inv1.getSize());
    }

    @Test
    public void testGetSize() {
     assertEquals(5, inv1.getSize());
    }

    /**
     * Test of addObject method, of class Inventory.
     
    @Test
    public void testAddObject() {
        inv1.addObject(armor);
        assertEquals(armor, inv1.getObject)
    }
    * //

 
}
