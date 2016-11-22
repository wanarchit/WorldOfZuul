package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The test class CharacterTest.
 * Unit tests of the Character class
 * 
 * @author Paul
 * @version 22/11/2016
 */
public class CharacterTest {
    
    private Character myCharacter;
    private Room myRoom;
    
    /**
     * Default constructor for test class CharacterTest
     */
    public CharacterTest(){
    }
    
    /**
     * 
     */
    public void setUp()
    {
        myRoom = new Room("Enter");
        myCharacter = new Character("Toto",3,3,50,myRoom);
    }
    /**
     * Method testNameToto
     * Checks if the name given as parameter in the constructor is correctly set to the attribute
     */
    public void testNameToto(){
        // The parameter "Toto" must be set as the name attribute
        assertEquals("Toto",myCharacter.getName());
    }
    
    /**
     * Method testDefaultName
     * Checks that the default name is "Tata", if the given name is empty
     */
    public void testDefaultName(){
        Character bad = new Character("",3,4,50,myRoom);
        assertEquals("Tata", bad.getName());
    }
    
    /**
     * Method testHealthNeg
     * Checks if the loosing of HP cannot be under 0 value
     */
    public void testHealthNeg(){
        // The parameter HP can not be negative, it initialized at 100
        // So if charcter loose 110 HP, HP has to be at 0 and not -10 (negative)
        myCharacter.LoseHP(-110);
        assertEquals(0,myCharacter.getHP());
    }
    
    /**
     * Method testHealth100
     * Checks if the adding HP cannot be superior to 100
     */
    public void testHealth100(){
        // The parameter HP can not be negative, it initialized at 100
        // So if charcter gain 10 HP, HP has to be at 1000 and not 110
        myCharacter.GainHP(10);
        assertEquals(100,myCharacter.getHP());
    }
    
    /**
     * Method testStrength
     * Check if value returned by method getStrenght return the good value
     */
    public void testGetStrength(){
        assertEquals(3,myCharacter.getStrength());
    }
    
    /**
     * Method testDefense
     * Check if value returned by method getDefense return the good value
     */
    public void testGetDefense(){
        assertEquals(4,myCharacter.getDefense());
    }
    
    /**
     * Method testMoney
     * Check if value returned by method getMoney return the good value
     */
    public void testGetMoney(){
        // here, Money is initialized at 50
        assertEquals(50,myCharacter.getMoney());
    }
    
    /**
     * Method testSetMoney
     * Checks if setter works well
     */
    public void testSetMoney(){
        // Money is initialized at 50 so if setter works well, value has to change at 80.
        myCharacter.setMoney(80);
        assertEquals(80,myCharacter.getMoney());
    }
    
    /**
     * 
     */
    public void testGetRoom(){
        assertEquals(myRoom,myCharacter.getActualRoom());
    }
    
    /**
     * 
     */
    public void testSetRoom(){
        Room actuNewRoom = new Room("room1");
        myCharacter.setActualRoom(actuNewRoom);
        assertEquals(actuNewRoom,myCharacter.getActualRoom());
    }
}
