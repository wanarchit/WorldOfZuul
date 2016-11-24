/*
 * This class allows the test of all functions presents on the Consummable class 
 * @Marion & Clément
 * version 22/11/2016
*/
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConsummableTest {
    //Theses declarations will allow the creation of object only created to test functions
    private Consummable consummable;// creation of a new consummable
    
    public ConsummableTest() 
    {
    }
  
    @Before
    public void setUp() 
    {
        consummable = new Consummable ("name1", 5, 5); 
    }
    
    @After
    public void tearDown() 
    // At the end of tests, inv1 and consummable take a null value
    {
        consummable = null;
    }

    //test allows to check the use method in the Consummable class
    @Test
    public void testUse() 
    {
    }

    //test allows to check the getBonus method in the Consummable class
    @Test
    public void testGetBonus() 
    {
       assertEquals(5, consummable.getBonus());//check if the bonus value obtained by the method is similar to the value enter by the user
    }
    
}
