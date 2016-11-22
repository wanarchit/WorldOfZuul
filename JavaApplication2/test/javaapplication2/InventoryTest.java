/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SERAZIN
 */
public class InventoryTest {
    
    public InventoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setSize method, of class Inventory.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        Inventory instance = null;
        instance.setSize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Inventory.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Inventory instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addObject method, of class Inventory.
     */
    @Test
    public void testAddObject() {
        System.out.println("addObject");
        Item i = null;
        Inventory instance = null;
        instance.addObject(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObject method, of class Inventory.
     */
    @Test
    public void testDeleteObject() {
        System.out.println("deleteObject");
        Item i = null;
        Inventory instance = null;
        instance.deleteObject(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
