/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Paul
 */
public class InitializeGame {
    
    private Player myPlayer;
    private NPC monster1,monster2,seller1,friend1;
    private Consummable healthPotion;
    private Weapon sword,axe,axe2;
    private Armor shield;
    private Room room1;
    
    public InitializeGame(){
        
        // Room : name, empty (true/false)
        room1 = new Room("Enter",false);
        
        // Item :
            // Armor : name, price, defense
            // Weapon : name, price, damage
            // Consummable : name, price, bonus
        healthPotion = new Consummable("Life Potion",15,25);
        sword = new Weapon("Fire Sword",5,5);
        axe = new Weapon("Single Axe",4,2);
        axe2 = new Weapon("Single Axe2",5,5);
        shield = new Armor("Iron Armor",10,10);
        
        // NPC : name, stength, defense, money, sizeInventory, weapon, armor, hostile, parole
        monster1 = new NPC("Spider",3,4,0,5,null,null,true,"");
        monster1.LoseHP(80);
        monster2 = new NPC("Evil Knight",5,5,20,5,null,null,true,"");
        seller1 = new NPC("At the small price",2,2,50,15,null,null,false,"Hello!");
        friend1 = new NPC("Machin",1,3,4,3,null,null,false,"I am your friend!");
        
        // adding items
        monster2.getInventory().addObject(sword);
        monster2.getInventory().addObject(shield);
        monster2.setWeaponEquipped(sword);
        monster2.setArmorEquipped(shield);
        friend1.getInventory().addObject(axe);
        friend1.setWeaponEquipped(axe);
        seller1.getInventory().addObject(healthPotion);
        
        // Player : name, strength, defense, money, sizeInv, weaponEquipped, armorEquipped, actuelRoom
        myPlayer = new Player("Paul",2,2,2,10,null,null,room1);
        myPlayer.getInventory().addObject(axe2);
        myPlayer.setWeaponEquipped(axe2);
        
        // Adding NPC in room
        room1.addNPC(monster1);
        room1.addNPC(monster2);
        room1.addNPC(friend1);
        room1.addNPC(seller1);
        
        Battle combat = new Battle(monster1,myPlayer);
        combat.beat();
    }
    
    
}
