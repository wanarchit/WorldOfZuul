package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConsummableTest {
    private Consummable consummable;
    private Inventory inv1;
    
    public ConsummableTest() 
    {
    }
  
    @Before
    public void setUp() 
    {
        inv1 = new Inventory(2);
        consummable = new Consummable ("name1", inv1, 5, 5);
    }
    
    @After
    public void tearDown() 
    {
        inv1 = null;
        consummable = null;
    }

    @Test
    public void testUse() 
    {
    }

    @Test
    public void testGetBonus() 
    {
       assertEquals(5, consummable.getBonus());
    }
    
}
