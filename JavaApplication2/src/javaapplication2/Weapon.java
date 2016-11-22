package javaapplication2;

/**
 * The class Weapon is a heiress class of the class Item. It handles 
 * everything about weapon.
 * @author Clément, Marion
 * version 22/11/2016
 */
public class Weapon extends Item {
    private int damage; // damage of the weapon

/**
 * constructor of the Weapon class
 * @param nI Weapon name
 * @param inve the inventory in which the weapon is
 * @param pc the price of the weapon
 * @param dg how much damage the weapon deals
 */
public Weapon(String nI, Inventory inve, int pc, int dg){
    super(nI, inve, pc);
    damage = dg;
}

/**
 * This method allows to use the weapon to deal damage
 * @param cha the character who uses the weapon
 */
public void use(Character cha){}

/**
 * Get the amount the damage the weapon deals
 * @return the damage of the weapon
 */
public int getDamage(){
    return damage;
}
}
