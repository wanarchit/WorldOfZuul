package javaapplication2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The class Character
 * 
 * @author paul
 * @version 22/11/2016
 */
public class Character
{
    // Name of the character. It cannot be changed
    private final String namePerso;
    
    private Inventory inv;
    // character is alive when his life is between 1 and 100 HP.
    // character is dead when his life = 0
    // Default value is 100
    private int hP;
    // Strength has an influence in the calcul during battle
    // It a base value of character strength, this value cannot be changed
    // This value cannot be negative but can be equal 0
    private final int strength;
    // Defense has an influence in the calcul during battle
    // It a base value of character defense, this value cannot be changed
    // This value cannot be negative but can be equal 0
    private final int defense;
    // it is the carried weapon
    // this weapon has to be in inventory
    // this weapon stay in inventory when it carried
    // At the beginin Weapon carried can be null
    private Weapon weaponEquipped;
    // it is the carried Armor
    // this armor has to be in inventory
    // this armor stay in inventory when it carried
    // At the beginin Armor carried can be null
    private Armor armorEquipped;
    // It is the gold quantity that possosses by character
    // Money cannot be negative but can be equal 0, there is no positive limit
    private int money;
    
    /**
     * Constructor with name parameter
     * 
     * Stength and defense of character are using for battle
     * Money cannot be negative but has not positive limit
     * Armor and Weapon can be null at the begining
     * 
     * @param name : it is the name of character (NPC or Player)
     * @param stren : it is the strength point of the character
     * @param def : it is the defense point of the caracter
     * @param mon : it the money of character
     * @param sizeInt : it is the size of inventory
     * @param wea : it is the weapon which is carried by character
     * @param amo : it is the armor which is carried by character
     */
    public Character(String name,int stren, int def, int mon, int sizeInt, Weapon wea, Armor amo){
        hP=100;
        if (name.equals("")){
            name="Tata";}
        namePerso=name;
        strength=stren;
        defense=def;
        money=mon;
        inv = new Inventory(sizeInt);
        weaponEquipped=wea;
        armorEquipped=amo;        
    }
    
    
    
  //  private void setInv(){
    
   // }
/**
 * Utility function to get the inventory of character
 * 
 * @return inventory
 */
   public Inventory getInv(){
        return inv;
    }
/**
 * Utility function to get the point of life number of character
 * 
 * @return HP : point of life of character
 */
    public int getHP(){
        return hP;
    }

    /**
     * Update of point of life of character
     * 
     * @param nbHP the number of point of life lose or gained by character
     */
    private void setHP(int nbHP){
        hP = nbHP;
    }

    /**
     * The character loose point of life
     * If character loose more than the remaining HP, HP are set to 0
     * @param nbLoseHP the number of HP which is loose
     */
    public void LoseHP(int nbLoseHP){
        int life = getHP();
        if (life-nbLoseHP < 0){
            setHP(0);}
        else{setHP(nbLoseHP);}
    }
    
    /**
     * The character gain point of life
     * If character gain more than the remaining HP, HP are set to 100
     * @param nbGainHP the number of HP which is gained
     */
    public void GainHP(int nbGainHP){
        int life = getHP();
        if (life+nbGainHP > 100){
            setHP(100);}
        else{setHP(nbGainHP);}
    }
    
    /**
     * Utility function to get the name of character
     * @return name of character
     */
    public String getName(){
        return namePerso;
    }

    /**
     * Utility function to get the strength of character
     * @return point of strength of character
     */
    public int getStrength(){
        return strength;
    }

    /**
     * Utility function to get the defense of character
     * @return point of defense of character
     */
    public int getDefense(){
        return defense;
    }

    /**
     * Utility function to get the weapon which is carried by character
     * @return the weapon carried by character
     */
    public Weapon getWeaponEquipped(){
        return weaponEquipped;
    }

    /**
     * Change the weapon which is carried by character by new weapon or any weapon
     * The carried weapon can be null and the weapon has to be in inventory character
     * @param newWeapon which will be carried by character
     */
    private void setWeaponEquipped(Weapon newWeapon){
        weaponEquipped = newWeapon;
    }
    
    /**
     * Utility function to get the armor which is carried by character
     * @return the armor carried by character
     */
    public Armor getArmorEquipped(){
        return armorEquipped;
    }

    /**
     * Change the armor which is carried by character by new armor or any armor
     * The carried armor can be null and the armor has to be in inventory character
     * @param newArmor which will be carried by character
     */
    private void setArmorEquipped(Armor newArmor){
        armorEquipped = newArmor;
    }
    
    /**
     * Utility function to get the number of gold posseded by character
     * 
     * @return the money of character
     */
    public int getMoney(){
        return money;
    }

    /**
     * The character gain or loss money
     * the final value of money cannot be negative
     * 
     * @param newMoney : value of adding or losing money
     */
    public void setMoney(int newMoney){
        money = newMoney;
}

}
            
