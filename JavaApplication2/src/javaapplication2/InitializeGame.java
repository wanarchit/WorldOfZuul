package javaapplication2;
import javax.swing.*;

/**
 *
 * @author Paul
 */
public class InitializeGame {
    
    private Player myPlayer;
    private NPC monster1,monster2,seller1,friend1;
    private Consummable healthPotion, poisonPotion;
    private Weapon sword,axe,axe2;
    private Armor shield;
    private Room room1,room2,room3,room4;
    private Icon pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8;
    private LockedDoor door1,door2,door3;
    private Sound s;
    
    public InitializeGame(){
        s= new Sound();
        // Room : name, empty (true/false)
        room1 = new Room("Enter",false,null);
        room2 = new Room("Saloon",false,null);
        room3 = new Room("Bathroom",false,null);
        room4 = new Room("Big room",false,null);
        
        // Door : locked ?, Room actual, Room next, Icon Door
            // Locked door : open?, Room actual, Room next, doorName, keyName, keyPrice, pictKey, pictDoor
        pic7 = new ImageIcon("images/key1.PNG");
        door1 = new LockedDoor(false,room1,room2,"Salon Door","Big Key",2,pic7,null);
        door2 = new LockedDoor(false,room1,room3,"Bathroom Door","Small Key",5,pic8,null);
        door3 = new LockedDoor(false,room2,room4,"Door je sais pas cb","Key",5,pic6,null);
        
        
        // Item :
            // Armor : name, price, defense
            // Weapon : name, price, damage
            // Consummable : name, price, bonus
            // Key : cf : lockedDoor
        pic1 = new ImageIcon("images/lifePotionP.PNG");
        healthPotion = new Consummable("Life Potion",15,25,pic1);
        pic2 = new ImageIcon("images/epee2.PNG");
        sword = new Weapon("big Sword",12,8,pic2);
        pic3 = new ImageIcon("images/hache1.PNG");
        axe = new Weapon("Single Axe",4,2,pic3);
        pic4 = new ImageIcon("images/hache2.PNG");
        axe2 = new Weapon("Axe",5,5,pic4);
        pic5 = new ImageIcon("images/armure4.PNG");
        shield = new Armor("Iron Armor",10,10,pic5);
        pic6 = new ImageIcon("images/poisonPotionP.PNG");
        poisonPotion = new Consummable("Poison",15,-15,pic6);
        
        
        
        
        
        // NPC : name, stength, defense, money, sizeInventory, weapon, armor, hostile, parole
        monster1 = new NPC("Spider",3,4,3,5,null,null,true,"",null);
        monster1.loseHP(-70);
        monster2 = new NPC("Evil Knight",5,5,20,5,null,null,true,"",null);
        seller1 = new NPC("At the small price",2,2,50,15,null,null,false,"Hello!",null);
        friend1 = new NPC("Machin",1,3,4,3,null,null,false,"I am your friend!",null);
        
        // adding items
        monster1.getInventory().addObject(healthPotion);
        monster2.getInventory().addObject(sword);
        monster2.getInventory().addObject(shield);
        monster2.setWeaponEquipped(sword);
        monster2.setArmorEquipped(shield);
        friend1.getInventory().addObject(axe);
        friend1.setWeaponEquipped(axe);
        seller1.getInventory().addObject(healthPotion);
        seller1.getInventory().addObject(sword);
        seller1.getInventory().addObject(shield);
        
        
        // Player : name, strength, defense, money, sizeInv, weaponEquipped, armorEquipped, actuelRoom
        myPlayer = new Player("Paul",2,2,2,7,null,null,room1,null);
        myPlayer.getInventory().addObject(axe2);
        myPlayer.getInventory().addObject(axe);
        myPlayer.getInventory().addObject(healthPotion);
        myPlayer.getInventory().addObject(sword);
        myPlayer.getInventory().addObject(shield);
        myPlayer.getInventory().addObject(poisonPotion);
        myPlayer.getInventory().addObject(door1.getKey());
        myPlayer.setWeaponEquipped(axe2);
        
        // Adding NPC in room
        room1.addNPC(monster1);
        room1.addNPC(monster2);
        room1.addNPC(friend1);
        room1.addNPC(seller1);
        room1.setExit("South",door1);
        room1.setExit("West", door2);
        //----------------------------------------
        room2.setExit("East",door3);
        //Battle combat = new Battle(monster1,myPlayer);
        //combat.beat();
        myPlayer.loseHP(-40);
        s.playSound("music/truc.wav");
        //InterfaceInventory obj_game = new InterfaceInventory(myPlayer);
        InterfaceTest3 obj_game = new InterfaceTest3(myPlayer);
        Graphique aff = new Graphique();
        aff.Affiche(myPlayer);
        //InterfaceTrade obj_game = new InterfaceTrade(myPlayer,seller1);
    }
    
    
}
