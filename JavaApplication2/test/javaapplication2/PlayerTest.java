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
 * @author Paul
 */
public class PlayerTest {
    private Player myPlayer;
    private Room r,r2;
    public PlayerTest() 
    {
        myPlayer= new Player("toto",3,3,3,3,null,null,r);
    }    
    @BeforeClass

    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getKarma method, of class Player.
     */
    @Test
    public void testGetKarma() {
        System.out.println("getKarma");                                                                                                                                                                                                                            
        Player instance = new Player();
        int expResult = 100;
        int result = instance.getKarma();
        assertEquals(expResult, result);

    }
    
    /**
     * Test of setKarm method of class Player
     */
    @Test
    public void testSetKarma()
    {
        myPlayer.setKarma(20);
        assertEquals(20,myPlayer.getKarma());
    }
    
    /**
     * Test of add10Karma of class Player
     */
    @Test
    public void testAdd10Karma()
    {
        //Assuming the value is set to 20
        myPlayer.add10Karma();
        assertEquals(30,myPlayer.getKarma());
    }
    
    /**
     * Test del10Karma method of Player class
     */
    @Test
    public void testDel10Karma()
    {
        //Assuming the value is set to 30
        myPlayer.del10Karma();
        assertEquals(20,myPlayer.getKarma());
    }
    
    /**
     * Test getActualRoom method of Player class
     */
    @Test
    public void testGetActualRoom()
    {
        //Assuming the actual room is set to r
        assertEquals(r,myPlayer.getActualRoom());
    }
    
    /**
     * Test setActualRoom method of Player class
     */
    @Test
    public void testSetActualRoom()
    {
       myPlayer.setActualRoom(r2);
       assertEquals(r2,myPlayer.getActualRoom());
    }
}
