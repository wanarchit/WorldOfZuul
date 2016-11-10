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
public class PNJTest {
    
    public PNJTest() {
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
     * Test of getParole method, of class PNJ.
     */
    @Test
    public void testGetParole() {
        System.out.println("getParole");
        PNJ instance = new PNJ();
        String expResult = "";
        String result = instance.getParole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHostile method, of class PNJ.
     */
    @Test
    public void testIsHostile() {
        System.out.println("isHostile");
        PNJ instance = new PNJ();
        boolean expResult = false;
        boolean result = instance.isHostile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHostile method, of class PNJ.
     */
    @Test
    public void testSetHostile() {
        System.out.println("setHostile");
        boolean host = false;
        PNJ instance = new PNJ();
        instance.setHostile(host);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
