/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import junit.framework.TestCase;
import org.junit.Before;
/**
 *
 * @author SERAZIN
 */
public class CoffreTest extends TestCase {
    private Coffre coffre;
    
    public CoffreTest(String nI, Inventaire inve, int px) {
        super(nI, inve, px);
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
    
}
