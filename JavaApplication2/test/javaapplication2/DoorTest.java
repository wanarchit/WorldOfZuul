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
 * @author saspaanithy
 */
public class DoorTest {
    
    public DoorTest() {
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
     * Test of getLocked method, of class Door.
     */
    @Test
    public void testGetLocked() {
        System.out.println("getLocked");
        Door instance = new Door();
        boolean expResult = true;
        boolean result = instance.getLocked();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocked method, of class Door.
     */
    @Test
    public void testSetLocked() {
        System.out.println("setLocked");
        Door instance = new Door();
        instance.setLocked();
    }

    /**
     * Test of getNextRoom method, of class Door.
     */
    @Test
    public void testGetNextRoom() {
        System.out.println("getNextRoom");
        Door instance = new Door();
        Room expResult = null;
        Room result = instance.getNextRoom();
        assertEquals(expResult, result);

    }

    /**
     * Test of getActualRoom method, of class Door.
     */
    @Test
    public void testGetActualRoom() {
        System.out.println("getActualRoom");
        Door instance = new Door();
        Room expResult = null;
        Room result = instance.getActualRoom();
        assertEquals(expResult, result);
 
    }
}