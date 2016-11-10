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
 * @author Marin
 */
public class PersonnageTest {
    String nom;
    int forc;
    int def;
    int arg;
    Room salle;
    Item i;
    
    public PersonnageTest() {
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
     * Test of setInv method, of class Personnage.
     */
    @Test
    public void testSetInv() {
        System.out.println("setInv");
        Personnage instance = new Personnage(nom,forc,def,arg,salle);
        assertNotSame(null,instance.setInv(i));
        
        

    }

    /**
     * Test of getInv method, of class Personnage.
     */
    @Test
    public void testGetInv() {
        System.out.println("getInv");
        Personnage instance = new Personnage(nom,forc,def,arg,salle);
        Inventaire expResult = null;
        Inventaire result = instance.getInv();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPV method, of class Personnage.
     */
    @Test
    public void testGetPV() {
        System.out.println("getPV");
        Personnage instance = new Personnage(nom,forc,def,arg,salle);
        int expResult = 100;
        int result = instance.getPV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPV method, of class Personnage.
     */
    @Test
    public void testSetPV() {
        System.out.println("setPV");
        int nb = 50;
        Personnage instance = new Personnage();
        instance.setPV(nb);
        assertEquals(50,instance.SetPV(nb));

    }

    /**
     * Test of getNom method, of class Personnage.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Personnage instance = new Personnage("toto",forc,def,arg,salle);
        String expResult = "toto";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSalleActu method, of class Personnage.
     */
    @Test
    public void testGetSalleActu() {
        System.out.println("getSalleActu");
        Personnage instance = new Personnage(nom,forc,def,arg,salle);
        Room expResult = null;
        Room result = instance.getSalleActu();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSalleActu method, of class Personnage.
     */
    @Test
    public void testSetSalleActu() {
        System.out.println("setSalleActu");
        Personnage instance = new Personnage(nom,forc,def,arg,salle);
        instance.setSalleActu();
    }

    /**
     * Test of getForce method, of class Personnage.
     */
    @Test
    public void testGetForce() {
        System.out.println("getForce");
        Personnage instance = new Personnage();
        int expResult = 0;
        int result = instance.getForce();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefense method, of class Personnage.
     */
    @Test
    public void testGetDefense() {
        System.out.println("getDefense");
        Personnage instance = new Personnage();
        int expResult = 0;
        int result = instance.getDefense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmeEquipee method, of class Personnage.
     */
    @Test
    public void testGetArmeEquipee() {
        System.out.println("getArmeEquipee");
        Personnage instance = new Personnage();
        Arme expResult = null;
        Arme result = instance.getArmeEquipee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArmeEquipee method, of class Personnage.
     */
    @Test
    public void testSetArmeEquipee() {
        System.out.println("setArmeEquipee");
        Personnage instance = new Personnage();
        instance.setArmeEquipee();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArgent method, of class Personnage.
     */
    @Test
    public void testGetArgent() {
        System.out.println("getArgent");
        Personnage instance = new Personnage();
        int expResult = 0;
        int result = instance.getArgent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArgent method, of class Personnage.
     */
    @Test
    public void testSetArgent() {
        System.out.println("setArgent");
        Personnage instance = new Personnage();
        instance.setArgent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
