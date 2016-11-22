/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SERAZIN
 */
public class InventoryTest {
    private Inventory inv1;
    private Character character1;
    private ArrayList<Item> list1;
    private Room r1;
    
    public InventoryTest() {
    }
    
    @Before
    public void setUp() 
    {
        r1 = new Room("enter");
        character1 = new Character ("toto", 5, 5, 10, r1);
        inv1 = new Inventory(2, character1);
    }
    
    @After
    public void tearDown() {
        r1= null;
        character1 = null;
        inv1 = null;
    }

    /**
     * Test of setSize method, of class Inventory.
     */
    @Test
    public void testSetSize() {
     assertEquals("The size is not correct", 5, inv1.getSize());
    }

    /**
     * Test of getSize method, of class Inventory.
     */
    @Test
    public void testGetSize() {
     assertEquals("The price is not correct", 5, inv1.getSize());
    }

    /**
     * Test of addObject method, of class Inventory.
     
    @Test
    public void testAddObject() {
        inv1.addObject(armor);
        assertEquals(armor, inv1.getObject)
    }
    * //

    /**
     * Test of deleteObject method, of class Inventory.
     
    @Test
    public void testDeleteObject() {
        System.out.println("deleteObject");
        Item i = null;
        Inventory instance = null;
        instance.deleteObject(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
