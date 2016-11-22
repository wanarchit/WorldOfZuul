/*
 * This class allows the test of all functions presents on the Armor class 
 * @Marion & Clément
 * version 22/11/2016
*/
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ArmorTest {
    //Theses declarations will allow the creation of object only created to test functions
    private Armor armor;//Creation of a new armor
    private Inventory inv1;//Creation of an inventary
    
    public ArmorTest() 
    {
    }
    
    @Before
    public void setUp() {
        inv1 = new Inventory(2);//creation of an inventory of a list of 2 items
        armor = new Armor ("name1", inv1, 5, 5);
    }
    
    @After
    public void tearDown() 
    // At the end of tests, inv1 and armor take a null value
    {
        inv1 = null;
        armor = null;
    }
    
    //test allows to check the use method in the Armor class
    @Test
    public void testUse() 
    {
    }
    //test allows to check the getDefense method in the Armor class
    @Test
    public void testGetDefense() 
    {
        assertEquals(5, armor.getDefense());//check if the value obtained by the method is similar to the value enter by the user 
    }
    
}
