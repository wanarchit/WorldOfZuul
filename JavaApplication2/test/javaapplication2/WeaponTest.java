/*
 * This class allows the test of all functions presents on the Weapon class 
 * @Marion & Clément
 * version 22/11/2016
*/
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeaponTest {
    //Theses declarations will allow the creation of object only created to test functions
    private Weapon weapon;//creation of a new weapon
    private Inventory inv1;//creation of a new inventary 
    
    public WeaponTest() 
    {
    }
    
    @Before
    public void setUp() 
    {
        inv1 = new Inventory(2); //creation of an inventory of a list of 2 items
        weapon = new Weapon ("name1", inv1, 5, 5);
    }
    
    @After
    public void tearDown()
     // At the end of tests, inv1 and weapon take a null value
    {
        inv1 = null;
        weapon = null;
    }

    //test allows to check the getDamage method in the Weapon class
    @Test
    public void testGetDamage() 
    {
      assertEquals(5,weapon.getDamage());//check if the damage value obtained by the method is similar to the value enter by the user
    }
    
}
