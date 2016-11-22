/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.RenderingHints.Key;
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
public class LockedDoorTest {
    
        Key myKey;
        Door mydoor;
        LockedDoor ld;
        LockedDoor ld1;
        LockedDoor ld2;
        String namekey="yolo";
        
        
    public LockedDoorTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkKey method, of class LockedDoor.
     * The test allowed to check if the methof checkKey work well
     * In this test we look if the name of the key and the name of the door are similar.
     */  
    
    @Test
    public void testcheckKey(){
         
        
        myKey = new Key(namekey);
        ld = new LockedDoor("yolo");
        
        check = ld.checkKey();
        assertEquals(true, check);
        
        ld1 = new LockedDoor("haha");
        
        check = ld1.checkKey();
        assertEquals(false, check);
    
    }
    
    /**
     * Test of getLockedDoor;
     * The test allowed to check if the method getLockedDoor work well
     * In this test we look if we get the Door boolean in order to know if the door
     * is open or not.
     */  
    
    public void testgetLockedDoor(){
        
        System.out.println("getLockedDoor");
        boolean result = ld2.getLockedDoor();
        assertEquals(false, result);
        
    }
}

