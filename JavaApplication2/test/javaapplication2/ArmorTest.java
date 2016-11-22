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
public class ArmorTest {
    
    public ArmorTest() {
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
     * Test of use method, of class Armor.
     */
    @Test
    public void testUse() {
        System.out.println("use");
        Character character = null;
        Armor instance = null;
        instance.use(character);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefense method, of class Armor.
     */
    @Test
    public void testGetDefense() {
        System.out.println("getDefense");
        Armor instance = null;
        int expResult = 0;
        int result = instance.getDefense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
