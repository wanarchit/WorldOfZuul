
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    private Item item;
    private Inventory inv1;
    
    public ItemTest() 
    {
    }
    
    @Before
    public void setUp() 
    {
       item = new Item("name1", inv1, 50);
    }
    
    @After
    public void tearDown() 
    {
        item = null;
    }

    @Test
    public void testUse() 
    {
    }

    @Test
    public void testGetPrice() {
        assertEquals(50, item.getPrice());
    }
    
}
