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
        Door d = new Door(false, ("Cuisine", true), ("Salon", false));
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
        boolean result = d.getLocked();
        assertEquals(false, result);
    }

    /**
     * Test of setLocked method, of class Door.
     */
    @Test
    public void testSetLocked() {
        System.out.println("setLocked");
        d.setLocked();
        assertEquals(true, d.locked);
        d.setLocked();
        assertEquals(false, d.locked);
    }

    /**
     * Test of getNextRoom method, of class Door.
     */
    @Test
    public void testNameGetNextRoom() {
        System.out.println("getNextRoom");
        Room result = d.getNextRoom();
        assertEquals("Salon", result.nameRoom);
    }
    
    /**
     * Test of getNextRoom method, of class Door.
     */
    @Test
    public void testClearGetNextRoom() {
        System.out.println("getNextRoom");
        Room result = d.getNextRoom();
        assertEquals(false, result.clear);
    }

    /**
     * Test of getActualRoom method, of class Door.
     */
    @Test
    public void testNameGetActualRoom() {
        System.out.println("getActualRoom");
        Room result = d.getActualRoom();
        assertEquals("Cuisine", result.nameRoom);
    }
    
    /**
     * Test of getActualRoom method, of class Door.
     */
    @Test
    public void testGetActualRoom() {
        System.out.println("getActualRoom");;
        Room result = d.getActualRoom();
        assertEquals(true, result.clear);
    }
}