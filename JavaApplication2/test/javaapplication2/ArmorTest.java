
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ArmorTest {
    private Armor armor;
    private Inventory inv1;
    
    public ArmorTest() {
    }
    
    @Before
    public void setUp() {
        inv1 = new Inventory(2);
        armor = new Armor ("name1", inv1, 5, 5);
    }
    
    @After
    public void tearDown() {
        inv1 = null;
        armor = null;
    }

    @Test
    public void testUse() 
    {
    }

    @Test
    public void testGetDefense() 
    {
        assertEquals(5, armor.getDefense());
    }
    
}
