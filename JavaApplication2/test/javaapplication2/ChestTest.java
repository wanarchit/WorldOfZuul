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
public class ChestTest {
    private Chest chest;
    private Inventory inv1;
    private Character character1;
    private ArrayList<Item> list1;
    private Room r1;
    
    public ChestTest() {
    }
    
    
    @Before
    public void setUp() {
        r1 = new Room("enter", true);
        character1 = new Character ("toto", 5, 5, 10, r1);
        inv1 = new Inventory(2, character1);
        chest = new Chest("name1", inv1, 5, 5);
    }
    
    @After
    public void tearDown() {
        r1 = null;
        character1 = null;
        inv1 = null;
        chest = null;
    }
/**
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 */
    
    @Test
    public void testGetDMoney() {
        assertEquals("The money is not correct", 5, chest.getMoney());
    }
    
    @Test
    public void testGetInventory() {
        assertEquals("The inventory is not correct", inv1, chest.getInventory());
    }
    
    
}
