
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChestTest {
    private Chest chest;
    private Inventory inv1;
    
    public ChestTest() 
    {
    }
    
    @Before
    public void setUp() 
    {
        inv1 = new Inventory(2);
        chest = new Chest( inv1, 5, 5);
    }
    
    @After
    public void tearDown() 
    {
        inv1 = null;
        chest = null;
    }
    
    @Test
    public void testGetDMoney() 
    {
        assertEquals(5, chest.getMoney());
    }
    
    @Test
    public void testGetInventory() 
    {
        assertEquals( inv1, chest.getInventory());
    }   
}
