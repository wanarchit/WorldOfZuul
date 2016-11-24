
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Test class of InventoryTest
 * Unit tests of the Inventory class
 * @author Marion
 * @version 22/11/16
 */
public class InventoryTest {
    private Inventory inv1;
    private Weapon myWeapon;
    private Armor myArmor;
    /**
     * Constructor for the InventoryTest class
     */
    public InventoryTest()
    {
    }
    
    @Before
    public void setUp() 
    {
        myWeapon = new Weapon("axe",5,4);
        myArmor = new Armor("head",6,5);
        inv1 = new Inventory(2);
        
    }
    
    @After
    public void tearDown() {
        inv1 = null;
    }
    /**
     * Method testSetSize
     * Test if the size is correctly set in the attribute when using a setter on it
     */
    @Test
    public void testSetSize() 
    {
     inv1.setSize(5);
     assertEquals(5, inv1.getSize());
    }
    /**
     * Method testGetSize
     * Checks if the size given in the inventory constructor is correctly set to the size attribute
     */
    @Test
    public void testGetSize() 
    {
     assertEquals(2, inv1.getSize());
    } 
    
    /**
     * Method testAddObject
     * Check it correctly add an item to the inventory
     */
    @Test
    public void testAddObject(){
        inv1.addObject(myArmor);
        assertEquals(1,inv1.getLength());
        inv1.addObject(myWeapon);
        assertEquals(2,inv1.getLength());
        System.out.println("l'inventaire est compose de "+inv1);
    }
           
    /**
     * Method testDeleteObject
     * Check it correctly delete an item from the inventory
     */
    @Test
    public void testDeleteObject(){
        assertEquals(1,inv1.getLength());
        inv1.deleteObject(myWeapon);
        assertEquals(0,inv1.getLength());
        System.out.println("l'inventaire est compose de "+inv1);
    }
}
