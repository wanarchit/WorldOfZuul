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
    
        private Key myKey;
        private Door mydoor;
        private LockedDoor ld;
        private LockedDoor ld1;
        private LockedDoor ld2;
        private String namekey="yolo";
        private Room r1;
        private Room r2;
        
        
        
    public LockedDoorTest() {
    }
    
    
    @Before
    public void setUp() {
        r1 = new Room ("bedroom", false);
        r2 = new Room ("garden", false);
        mykey =new Key
        ld = new LockedDoor (false, r1, r2, "yolo", myKey);
   
    
    @After
    public void tearDown() {
        r1 = null;
        r2 = null;
        ld = null;
    }
        
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

