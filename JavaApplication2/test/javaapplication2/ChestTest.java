/*
 * This class allows the test of all functions presents on the Chest class 
 * @Marion & Clément
 * version 22/11/2016
*/
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChestTest {
    //Theses declarations will allow the creation of object only created to test functions
    private Chest chest; // creation of a new chest
    private Inventory inv1;// creation of a new inventory
    
    public ChestTest() 
    {
    }
    
    @Before
    public void setUp() 
    {
        chest = new Chest("chest1", 50);
    }
    
    @After
    public void tearDown() 
    // At the end of tests, inv1 and chest take a null value
    {
        inv1 = null;
        chest = null;
    }
    
    //test allows to check the getMoney method in the Chest class
    @Test
    public void testGetDMoney() 
    {
        assertEquals(5, chest.getMoney());//check if the money value obtained by the method is similar to the value enter by the user
    }
    
    //test allows to check the getInventory method in the Chest class
    @Test
    public void testGetInventory() 
    {
        assertEquals(inv1, chest.getInventory());//check if the inventary obtained by the method is similar to the value enter by the user
    }   
}
