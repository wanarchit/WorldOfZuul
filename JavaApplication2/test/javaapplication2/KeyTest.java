package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KeyTest {
    private Key key;
    private Inventory inv1;
    private LockedDoor r1;
    
     /**
     *  /**
     * Default constructor for the class KeyTest.
     * @author Marion, Clément
     */
    public KeyTest() {
    }
        
    @Before
    public void setUp() {
        inv1 = new Inventory(2);
        key = new Key("name", inv1, 5, r1);
    }
    
    @After
    public void tearDown() 
    {
        inv1 = null;
        key = null;
    }

    /**
     * Test if the key open the door
     */
    @Test
    public void testGetDoor() 
    {
       assertEquals(r1,key.getDoor());
    }  
}
