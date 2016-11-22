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
    private Weapon myWeapon;
    private Armor myArmor;
    //private Inventory myInventory;
    
    /**
     * Default constructor for test class CharacterTest
     */
    public CharacterTest(){
    }
    
    /**
     * 
     */
    @Before
    public void setUp()
    {
        myCharacter = new Character("Toto",3,4,50,10, null,null);
        Inventory inv = myCharacter.getInv();
        myWeapon = new Weapon("axe",inv,5,4);
        myArmor = new Armor("head",inv,6,5);
    }
    
    /**
     * 
     */
    @After
    public void tearDown(){
        //
    }
    
    /**
     * Method testNameToto
     * Checks if the name given as parameter in the constructor is correctly set to the attribute
     */
    @Test
    public void testNameToto(){
        // The parameter "Toto" must be set as the name attribute
        assertEquals("Toto",myCharacter.getName());
    }
    
    /**
     * Method testDefaultName
     * Checks that the default name is "Tata", if the given name is empty
     */
    @Test
    public void testDefaultName(){
        Character bad = new Character("",3,4,50,10, null,null);
        assertEquals("Tata", bad.getName());
    }
    
    /**
     * Method testHealthNeg
     * Checks if the loosing of HP cannot be under 0 value
     */
    @Test
    public void testHealthNeg(){
        // The parameter HP can not be negative, it initialized at 100
        // So if charcter loose 110 HP, HP has to be at 0 and not -10 (negative)
        myCharacter.LoseHP(110);
        assertEquals(0,myCharacter.getHP());
    }
    
    /**
     * Method testHealth100
     * Checks if the adding HP cannot be superior to 100
     */
    @Test
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
    @Test
    public void testGetStrength(){
        assertEquals(3,myCharacter.getStrength());
    }
    
    /**
     * Method testDefense
     * Check if value returned by method getDefense return the good value
     */
    @Test
    public void testGetDefense(){
        assertEquals(4,myCharacter.getDefense());
    }
    
    /**
     * Method testMoney
     * Check if value returned by method getMoney return the good value
     */
    @Test
    public void testGetMoney(){
        // here, Money is initialized at 50
        assertEquals(50,myCharacter.getMoney());
    }
    
    /**
     * Method testSetMoney
     * Checks if setter works well
     */
    @Test
    public void testSetMoney(){
        // Money is initialized at 50 so if setter works well, value has to change at 80.
        myCharacter.setMoney(80);
        assertEquals(80,myCharacter.getMoney());
    }
    
    /**
     * Method testGetArmor
     * Checks if armor null is possible 
     */
    @Test
    public void testGetArmor(){
        assertEquals(null,myCharacter.getArmorEquipped());
    }
    
    /**
     * Method testGetWeapon
     * Checks if weapon null is possible
     */
    @Test
    public void testGetWeapon(){
        assertEquals(null,myCharacter.getWeaponEquipped());
    }
    
}
