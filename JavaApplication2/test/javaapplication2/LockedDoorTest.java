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
 * @author Jonathan
 */
public class LockedDoorTest {
    
        Key myKey;
        Door mydoor;
        String ld;
        String ld1;
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
}

