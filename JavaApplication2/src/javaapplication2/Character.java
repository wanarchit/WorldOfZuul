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
public class Character {
    private String namePerso;
    private Room actualRoom;
    // private Img Skin;
    private Inventory inv;
    private int hP= 100;
    private int strength;
    private int defense;
    private Weapon weaponEquipped;
    private Armor armorEquipped;
    private int money;
    
    /**
     * Constructor with name parameter
     * 
     * Stength and defense of character are using for battle
     * Money cannot be negative but has not positive limit
     * Armor and Weapon can are null at the begining
     * 
     * @param name : it is the name of character (NPC or Player)
     * @param stren : it is the strength point of the character
     * @param def : it is the defense point of the caracter
     * @param mon : it the money of character
     * @param r1 : it is the actual room where the character is
     * @param sizeInt : it is the size of inventory
     * @param wea : it is the weapon which is carried by character
     * @param amo : it is the armor which is carried by character
     */
    public Character(String name,int stren, int def, int mon, Room r1, int sizeInt, Weapon wea, Armor amo){
        hP=100;
        if (name.equals("")){
            name="Tata";}
        namePerso=name;
        strength=stren;
        defense=def;
        money=mon;
        inv = new Inventory(sizeInt, this);
        actualRoom=r1;
        weaponEquipped=wea;
        armorEquipped=amo;        
    }
    
    
    
  //  private void setInv(){
    
   // }

   public Inventory getInv(){
        return inv;
    }

    public int getHP(){
        return hP;
    }

    private void setHP(int nbHP){
        hP = nbHP;
    }

    public void LoseHP(int nbLoseHP){
        int life = getHP();
        if (life-nbLoseHP < 0){
            setHP(0);}
        else{setHP(nbLoseHP);}
    }
    
    public void GainHP(int nbGainHP){
        int life = getHP();
        if (life+nbGainHP > 100){
            setHP(100);}
        else{setHP(nbGainHP);}
    }
    
    public String getName(){
        return namePerso;
    }

    public Room getActualRoom(){
        return actualRoom;
    }

    public void setActualRoom(Room newRoom){
        actualRoom = newRoom;
    }

    public int getStrength(){
        return strength;
    }

    public int getDefense(){
        return defense;
    }

    public Weapon getWeaponEquipped(){
        return weaponEquipped;
    }

    private void setWeaponEquipped(Weapon newWeapon){
        weaponEquipped = newWeapon;
    }

    public Armor getArmorEquipped(){
        return armorEquipped;
    }

    private void setArmorEquipped(Armor newArmor){
        armorEquipped = newArmor;
    }
    
    public int getMoney(){
        return money;
    }

    public void setMoney(int newMoney){
        money = newMoney;
}

}
            
