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
public class CleTest extends TestCase{
    private Cle cle;
    
    public CleTest(LockedDoor nameDoor) {
        super(nameDoor);
    }

    //Before
    public void setUp() throws Exception {
    super.setUp();
    cle = new Cle("nameDoor1");
    }
    
    //After
    protected void tearDown() throws Exception {
    super.tearDown();
    cle = null;
  }

    /**
     * Test of use method, of class Cle.
     */

    public void testUse() {
     assertNotNull("L'instance n'est pas créée", cle);
    }

    /**
     * Test of getDoor method, of class Cle.
     */
     public void testGetDegat() {
        assertEquals("La prochaine salle est incorrect", nameDoor, nameDoor.getDoor);
    }
    
}
