
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeaponTest {
    
    private Weapon weapon;
    private Inventory inv1;
    
    public WeaponTest() 
    {
    }
    
    @Before
    public void setUp() 
    {
        inv1 = new Inventory(2);
        weapon = new Weapon ("name1", inv1, 5, 5);
    }
    
    @After
    public void tearDown() 
    {
        inv1 = null;
        weapon = null;
    }

    @Test
    public void testGetDamage() 
    {
      assertEquals(5,weapon.getDamage());
    }
    
}
