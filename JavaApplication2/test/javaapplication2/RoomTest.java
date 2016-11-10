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
 * @author Jonathan
 */
public class RoomTest {
    
    public RoomTest() {
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
     * Test of isClear method, of class Room.
     */
    @Test
    public void testIsClear() {
        System.out.println("isClear");
        Room instance = new Room("Cuisine");
        boolean expResult = false;
        boolean result = instance.isClear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNomRoom method, of class Room.
     */
    @Test
    public void testGetNomRoom() {
        System.out.println("getNomRoom");
        Room instance = new Room("Cuisine");
        String expResult = "Cuisine";
        String result = instance.getNomRoom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setClear method, of class Room.
     */
    @Test
    public void testSetClear() {
        System.out.println("setClear");
        Room instance = new Room("Cuisine");
        boolean expResult = true;
        instance.setClear();
        assertEquals(expResult, instance.isClear());
    }

    /**
     * Test of setExit method, of class Room.
     */
    @Test
    public void testSetExit() {
        System.out.println("setExit");
        String s = "";
        Door d = null;
        Room instance = new Room("Cuisine");
        instance.setExit(s, d);
    }
    
}
