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
 * @author Jonathan
 */
public class RoomTest {
    private Room r;
    private NPC character1, character2;
    private Chest c1, c2;
    private Door d1, d2;
    
    public RoomTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        r = new Room("Cuisine", true);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isClear method, of class Room.
     */
    @Test
    public void testIsClear() {
        System.out.println("isClear");
        assertEquals(true, r.isClear());
    }

    /**
     * Test of getNomRoom method, of class Room.
     */
    @Test
    public void testGetNomRoom() {
        System.out.println("getNomRoom");
        assertEquals("Cuisine", r.getNameRoom());
    }

    /**
     * Test of setClear method, of class Room.
     */
    @Test
    public void testSetClear() {
        System.out.println("setClear");
        r.setClear();
        assertEquals(false, r.isClear());
        r.setClear();
        assertEquals(true, r.isClear());
    }

    /**
     * Test if a NPC is in a room twice
     */
    @Test
    public void testNPCTwice() {
        System.out.println("NPCTwice");
        character1 = new NPC("Toto",3,4,50,10, null,null,false, "Hey");
        character2 = new NPC("Toto",3,4,50,10, null,null,false, "Yo");
        r.addNPC(character1);
        r.addNPC(character2);
        assertNull(r.getLineNPCList(1));
    }
    
    /**
     * Test if a chest is in a room twice
     */
    @Test
    public void testChestTwice() {
        System.out.println("ChestTwice");
        c1 = new Chest("c1", 5, 18);
        c2 = new Chest("c2", 5, 18);
        r.addChest(c1);
        r.addChest(c2);
        assertNull(r.getLineChestList(1));
    }
    
    
    /**
     * Test if the same door is not twice in the room
     */
    @Test
    public void testDoorTwice() {
        System.out.println("DoorTwice");
        d1 = new Door(true, new Room("salon", true), new Room("chambre", true));
        r.setExit("North", d1);
        r.setExit("North", d1);
        assertNull(r.getHashMapLine(1));
    }
    
}
