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
public class ArmureTest extends TestCase {
    
    private Armure armure;
    
    public ArmureTest(int defense) {
        super(defense);
    }
    
    //Before
    protected void setUp() throws Exception {
    super.setUp();
    armure = new Armure("defense1");
    }
    
    //After
    protected void tearDown() throws Exception {
    super.tearDown();
    armure = null;
    }

    /**
     * Test of use method, of class Armure.
     */
    public void testUse() {
     assertNotNull("L'instance n'est pas créée", armure);
    }

    /**
     * Test of getDefense method, of class Armure.
     */

    public void testGetDefense() {
    assertEquals("La défense est incorrecte", defense, defense.getDefense);
    }
    
}
