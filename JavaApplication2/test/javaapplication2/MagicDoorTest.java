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
 * @author Jonathan, Babujhi
 */
public class MagicDoorTest {
    
    public MagicDoorTest() {
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
     * Test of resolve method, of class MagicDoor.
     * This test allowed check if the method send a boolean true if 
     * the password enter by the user is similar to the password of the magic 
     * door.  If the boolean is on false password are not similar.
     */
    
    @Test
    public void testResolve() {
        System.out.println("resolve");
        String pwd = "";
        MagicDoor md = new MagicDoor();
        boolean expResult = false;
        boolean result = md.resolve(pwd);
        assertEquals(expResult, result);
    }
    
}
