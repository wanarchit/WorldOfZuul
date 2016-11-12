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
public class ArmeTest extends TestCase {
    
    private Arme arme;
    
    public ArmeTest(int degat) {
        super(degat);
    }
    
    @Before
    protected void setUp() throws Exception {
    super.setUp();
    arme = new Arme("degat1");
  }
    
    
    @After
    protected void tearDown() throws Exception {
    super.tearDown();
    arme = null;
  }

    /**
     * Test of use method, of class Arme.
     */
    @Test
    public void testUse() {
     assertNotNull("L'instance n'est pas créée", arme);
    }

    /**
     * Test of getDegat method, of class Arme.
     */
    @Test
    public void testGetDegat() {
        assertEquals("Le degat est incorrect", degat, degat.getDegat)
    }
    
}
