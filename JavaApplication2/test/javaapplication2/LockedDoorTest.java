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
public class LockedDoorTest {
    
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
    public void testCheckKey() {
        
        System.out.println("checkKey");
        LockedDoor dl = new LockedDoor();
        dl.checkKey();
        assertequal(false, dl.checkKey());
        dl.checkKey();
        assertequal(true, dl.checkKey());
        
        fail("The test case is a prototype.");
    }

    private void assertequal(boolean b, boolean checkKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    }

