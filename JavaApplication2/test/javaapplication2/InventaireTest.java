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
public class InventaireTest {
    
    public InventaireTest() {
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
     * Test of setSize method, of class Inventaire.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        Inventaire instance = new Inventaire();
        instance.setSize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Inventaire.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Inventaire instance = new Inventaire();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterObjet method, of class Inventaire.
     */
    @Test
    public void testAjouterObjet() {
        System.out.println("ajouterObjet");
        Item i = null;
        Inventaire instance = new Inventaire();
        instance.ajouterObjet(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimerObjet method, of class Inventaire.
     */
    @Test
    public void testSupprimerObjet() {
        System.out.println("supprimerObjet");
        Item i = null;
        Inventaire instance = new Inventaire();
        instance.supprimerObjet(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
