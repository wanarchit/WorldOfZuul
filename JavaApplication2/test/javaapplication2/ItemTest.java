package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    private Item item;
    private Inventory inv1;
    
    /**
     * The constructor for the class ItemTest.
     */
    public ItemTest() 
    {
    }
    
    /**
     * Set up the fixture
     * Called before every test case methods.
     * Initialize the item for each test.
     */
    @Before
    public void setUp() 
    {
       item = new Item("name1", inv1, 50);
    }
    
    /**
     * Tear Down the test fixture
     * Called after every test case method
     */
    @After
    public void tearDown() 
    {
        item = null;
    }
    
    /**
     * Method testUse for the item.
     * If an item is present in the inventory, the Player can use this.
     * The Player cannot use an item absent in the inventory.
     */
    @Test
    public void testUse() 
    {
    }

    /**
     * Method testGetPrice
     * Checks if the getter works well, here, object was initialized to 50
     */
    @Test
    public void testGetPrice() {
        assertEquals(50, item.getPrice());
    }
    
}
