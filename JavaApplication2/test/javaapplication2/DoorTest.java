package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saspaanithy
 */
public class DoorTest {
    private Door d;
    public DoorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        d = new Door(false, new Room("Cuisine", true), new Room("Salon", false));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLocked method, of class Door.
     * This method allowed to check if the method GetLocked
     */
    @Test
    public void testGetLocked() {
        System.out.println("getLocked");
        boolean result = d.isLocked();
        assertEquals(false, result);
    }

    /**
     * Test of setLocked method, of class Door.
     */
    @Test
    public void testSetLocked() {
        System.out.println("setLocked");
        d.setLocked();
        assertEquals(true, d.isLocked());
        d.setLocked();
        assertEquals(false, d.isLocked());
    }

    /**
     * Test of getNextRoom method, of class Door.
     */
    @Test
    public void testNameGetNextRoom() {
        System.out.println("getNextRoom");
        Room result = d.getNextRoom();
        assertEquals("Salon", result.getNameRoom());
    }
    
    /**
     * Test of getNextRoom method, of class Door.
     */
    @Test
    public void testClearGetNextRoom() {
        System.out.println("getNextRoom");
        Room result = d.getNextRoom();
        assertEquals(false, result.isClear());
    }

    /**
     * Test of getActualRoom method, of class Door.
     */
    @Test
    public void testNameGetActualRoom() {
        System.out.println("getActualRoom");
        Room result = d.getActualRoom();
        assertEquals("Cuisine", result.getNameRoom());
    }
    
    /**
     * Test of getActualRoom method, of class Door.
     */
    @Test
    public void testGetActualRoom() {
        System.out.println("getActualRoom");
        Room result = d.getActualRoom();
        assertEquals(true, result.isClear());
    }
    
    /**
     * Test if actual et nextRoom are not the same. Test must fail.
     */
    @Test
    public void testActualNextRoomSame() {
        System.out.println("actual and Next Room same");
        assertNotSame(d.getActualRoom(), d.getNextRoom());
    }
}