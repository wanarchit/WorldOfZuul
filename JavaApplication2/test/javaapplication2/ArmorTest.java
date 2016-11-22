/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SERAZIN
 */
public class ArmorTest {
    private Armor armor;
     private Inventory inv1;
    private Character character1;
    private ArrayList<Item> list1;
    private Room r1;
    
    public ArmorTest() {
    }
    
    @Before
    public void setUp() {
        r1 = new Room("enter");
        character1 = new Character ("toto", 5, 5, 10, r1);
        inv1 = new Inventory(2, character1);
        armor = new Armor ("name1", inv1, 5, 5);
    }
    
    @After
    public void tearDown() {
        r1 = null;
        character1 = null;
        inv1 = null;
        armor = null;
    }

    /**
     * Test of use method, of class Armor.
     */
    @Test
    public void testUse() {
        
    }

    /**
     * Test of getDefense method, of class Armor.
     */
    @Test
    public void testGetDefense() {
        assertEquals("The defense is not correct", 5, armor.getDefense());
    }
    
}
