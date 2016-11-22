/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SERAZIN
 */
public class ItemTest {
    private Item item;
    private Inventory inv1;
    
    public ItemTest() {
    }
    
    @Before
    public void setUp() {
       item = new Item("name1", inv1, 50);
    }
    
    @After
    public void tearDown() {
        item = null;
    }

    /**
     * Test of use method, of class Item.
     */
    @Test
    public void testUse() {
    }

    /**
     * Test of getPrix method, of class Item.
     */
    @Test
    public void testGetPrice() {
        assertEquals("The price is not correct", item.getPrice());
    }
    
}
