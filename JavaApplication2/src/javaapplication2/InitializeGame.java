package javaapplication2;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Paul
 */
public class InitializeGame {
    
    private Player myPlayer;
    private Icon play;
    private NPC monst1,monst2,monst3,monst4,monst5,monst6,monst7,monst8,monst9,monst10,monst11,monst12,monst13,monst14;
    private NPC NPC1,NPC2,NPC3,NPC4,NPC5,NPC6;
    private Consummable healthPotionP,healthPotionG,chickenThigh, poisonPotionP,poisonPotionG,kiss,bagExt;
    private Weapon sword,axe,axe2;
    private Armor shield,shield2;
    private Room room0,room1,room2,room3,room4,room5,room6,room7,room8,room9,room10,room11,room12,room13,room14,room15,room16,room17,room18,room19,room20;
    private ArrayList<Room> arrayListRoom;
    private Icon picR0,picR1,picR2,picR3,picR4,picR5,picR6,picR7,picR8,picR9,picR10,picR11,picR12,picR13,picR14,picR15,picR16,picR17,picR18,picR19,picR20;
    private Door door2,door4,door5,door7,door8,door11,door12,door17,door18,door15;
    private Door door2b,door3b,door4b,door5b,door6b,door7b,door8b,door9b,door10b,door11b,door12b,door13b,door14b,door15b,door16b,door17b,door18b,door19b,door20b;
    private LockedDoor door1,door3,door6,door10,door13,door14,door20;
    private MagicDoor door9,door16,door19;
    private Chest chest1,chest2,chest3,chest4,chest5,chest6,chest7,chest8;
    private int str;
    private int def;
    private int mon;
    private int inv;
    private Weapon startWeap;
    private Armor startArm;
    
    public InitializeGame(String nameP){
        
        // Upload of pictures :
        //Rooms :
        picR0 = new ImageIcon("images/picRoom0b.PNG");
        picR1 = new ImageIcon("images/picRoom1b.PNG");
        picR2 = new ImageIcon("images/picRoom2b.PNG");
        picR3 = new ImageIcon("images/picRoom3b.PNG");
        picR4 = new ImageIcon("images/picRoom4b.PNG");
        picR5 = new ImageIcon("images/picRoom5b.PNG");
        picR6 = new ImageIcon("images/picRoom6b.PNG");
        picR7 = new ImageIcon("images/picRoom7b.PNG");
        picR8 = new ImageIcon("images/picRoom8b.PNG");
        picR9 = new ImageIcon("images/picRoom9b.PNG");
        picR10 = new ImageIcon("images/picRoom10b.PNG");
        picR11 = new ImageIcon("images/picRoom11b.PNG");
        picR12 = new ImageIcon("images/picRoom12b.PNG");
        picR13 = new ImageIcon("images/picRoom13b.PNG");
        picR14 = new ImageIcon("images/picRoom14b.PNG");
        picR15 = new ImageIcon("images/picRoom15b.PNG");
        picR16 = new ImageIcon("images/picRoom16b.PNG");
        picR17 = new ImageIcon("images/picRoom17b.PNG");
        picR18 = new ImageIcon("images/picRoom18b.PNG");
        picR19 = new ImageIcon("images/picRoom19b.PNG");
        picR20 = new ImageIcon("images/picRoom20b.PNG");
        
        // Room : name, empty (true/false)
        room0 = new Room("Exit",true,true,picR0);
        room1 = new Room("Enter",true,true,picR1);
        room2 = new Room("Little Room",true,true,picR2);
        room3 = new Room("Little Corridor",false,false,picR3);
        room4 = new Room("Dining Room",true,false,picR4);
        room5 = new Room("Crypt",false,true,picR5);
        room6 = new Room("Dark Corridor",true,false,picR6);
        room7 = new Room("Treasure Room",true,true,picR7);
        room8 = new Room("Perch of Dragons",false,true,picR8);
        room9 = new Room("Crossroads Room",true,false,picR9);
        room10 = new Room("Strange Room",true,true,picR10);
        room11 = new Room("Cellar",false,false,picR11);
        room12 = new Room("Fouras Room",true,false,picR12);
        room13 = new Room("Torture Chamber",false,false,picR13);
        room14 = new Room("Tavern",true,false,picR14);
        room15 = new Room("Lair of the Lich",false,true,picR15);
        room16 = new Room("Antechamber",false,false,picR16);
        room17 = new Room("Bedroom Princess",true,false,picR17);
        room18 = new Room("Laboratory",false,true,picR18);
        room19 = new Room("Empty Dungeon Bank",false,false,picR19);
        room20 = new Room("Lair of Pony",false,false,picR20);
        arrayListRoom = new ArrayList<Room>();
        arrayListRoom.add(room0);
        arrayListRoom.add(room1);
        arrayListRoom.add(room2);
        arrayListRoom.add(room3);
        arrayListRoom.add(room4);
        arrayListRoom.add(room5);
        arrayListRoom.add(room6);
        arrayListRoom.add(room7);
        arrayListRoom.add(room8);
        arrayListRoom.add(room9);
        arrayListRoom.add(room10);
        arrayListRoom.add(room11);
        arrayListRoom.add(room12);
        arrayListRoom.add(room13);
        arrayListRoom.add(room14);
        arrayListRoom.add(room15);
        arrayListRoom.add(room16);
        arrayListRoom.add(room17);
        arrayListRoom.add(room18);
        arrayListRoom.add(room19);
        arrayListRoom.add(room20);
        
        // Door : locked ?, Room actual, Room next, Icon Door
        door2 = new Door(false,room1,room2,null);
        door2b = new Door(false,room2,room1,null);
        door4 = new Door(false,room3,room4,null);
        door4b = new Door(false,room4,room3,null);
        door5 = new Door(false,room4,room5,null);
        door5b = new Door(false,room5,room4,null);
        door7 = new Door(false,room5,room6,null);
        door7b = new Door(false,room6,room5,null);
        door8 = new Door(false,room5,room12,null);
        door8b = new Door(false,room12,room5,null);
        door11 = new Door(false,room13,room14,null);
        door11b = new Door(false,room14,room13,null);
        door12 = new Door(false,room14,room19,null);
        door12b = new Door(false,room19,room14,null);
        door15 = new Door(false,room16,room17,null);
        door15b = new Door(false,room17,room16,null);
        door17 = new Door(false,room15,room10,null);
        door17b = new Door(false,room10,room15,null);
        door18 = new Door(false,room10,room9,null);
        door18b = new Door(false,room9,room10,null);
        
        
            // Locked door : open?, Room actual, Room next, doorName, keyName, keyPrice, pictKey, pictDoor
        door1 = new LockedDoor(true,room1,room0,"Exit Door","Key to Freedom",2,null,null);
        door3 = new LockedDoor(true,room2,room3,"Corridor Door","Rusty Key",5,null,null);
        door3b = new Door(false,room3,room2,null);
        door6 = new LockedDoor(true,room8,room7,"Reinforced Door","Treasure Key",5,null,null);
        door6b = new Door(false,room7,room8,null);
        door10 = new LockedDoor(true,room12,room13,"Big Door","Big Key",2,null,null);
        door10b = new Door(false,room13,room12,null);
        door13 = new LockedDoor(true,room19,room20,"Boss Door","Boss Key",5,null,null);
        door13b = new Door(false,room20,room19,null);
        door14 = new LockedDoor(true,room19,room18,"Laboratory Door","Laboratory Key",5,null,null);
        door14b = new Door(false,room18,room19,null);
        door20 = new LockedDoor(true,room9,room16,"Door to Princess","Beautiful Key",2,null,null);
        door20b = new Door(false,room16,room9,null);
        
        // MagicDoor : name, pass, lock, Room Actual, Room Next, pictDoor
        door9 = new MagicDoor("Cellar Door","",true,room6,room11,null);
        door9b = new Door(false,room11,room6,null);
        door16 = new MagicDoor("Dangerous Door","",true,room18,room15,null);
        door16b = new Door(false,room15,room18,null);
        door19 = new MagicDoor("Dragons Door","",true,room9,room8,null);
        door19b = new Door(false,room8,room9,null);
                
        // Item :
            // Armor : name, price, defense
                // Monster
        shield = new Armor("Iron Armor",10,10,null);    
                // NPC
                
                // Player
        shield2 = new Armor("Light Armor",10,10,null);
        
            // Weapon : name, price, damage
                // Monster
        sword = new Weapon("big Sword",12,8,null);
        axe = new Weapon("Single Axe",4,2,null);
        axe2 = new Weapon("Axe",5,5,null);
                // NPC
        
            // Consummable : name, price, bonus
        healthPotionP = new Consummable("Life Potion",10,25,null);
        poisonPotionP = new Consummable("Poison",20,-15,null);
        chickenThigh = new Consummable("chickenThigh",5,15,null);
        healthPotionG = new Consummable("Big Life Potion",25,50,null);
        poisonPotionG = new Consummable("Deadly Poison",50,-40,null);
        kiss = new Consummable("Princess Kiss",0,100,null);
        bagExt = new Consummable("Extension Bag",45,10,null);
        
        
        
        
        
        
        
        // NPC : name, stength, defense, money, sizeInventory, weapon, armor, hostile, parole, icon
            //Monster :
        monst1 = new NPC("Spider",0,0,0,0,null,null,true,"",null);
        monst2 = new NPC("Mummy",0,0,0,0,null,null,true,"",null);
        monst3 = new NPC("Mutant Rat",0,0,0,0,null,null,true,"",null);
        monst4 = new NPC("Troll",0,0,0,0,null,null,true,"",null);
        monst4.getInventory().addObject(door10.getKey());
        monst5 = new NPC("Dark Knight",0,0,0,0,null,null,true,"",null);
        monst6 = new NPC("Wizard",0,0,0,0,null,null,true,"",null);
        monst7 = new NPC("Witch",0,0,0,0,null,null,true,"",null);
        monst8 = new NPC("Lich",0,0,0,0,null,null,true,"",null); // Half-Boss
        monst9 = new NPC("Baby Dragon Female",0,0,0,0,null,null,true,"",null);
        monst10 = new NPC("Baby Dragon Male",0,0,0,0,null,null,true,"",null);
        monst11 = new NPC("Big Dragon",0,0,0,0,null,null,true,"",null);
        monst11.getInventory().addObject(door6.getKey());
        monst12 = new NPC("Evil Pony",0,0,0,0,null,null,true,"",null); // Boss P1
        monst12.getInventory().addObject(door1.getKey());
        monst12.getInventory().addObject(door20.getKey());
        monst13 = new NPC("Enraged Unicorn",0,0,0,0,null,null,true,"",null); // Boss P2
        monst14 = new NPC("Goblin",0,0,0,0,null,null,true,"",null);
        
            //PNJ Friendly :
        NPC1 = new NPC("Server",0,0,0,0,null,null,false,"",null); // MDP + Seller (potions++ + arme up)
        NPC2 = new NPC("Father Fouras",0,0,0,0,null,null,false,"",null); // enigme => MDP
        NPC3 = new NPC("Keys Keeper",0,0,0,0,null,null,false,"",null); // Seller (key + armor up++ + potion)
        NPC3.getInventory().addObject(door14.getKey());
        NPC4 = new NPC("Grandfather Fouras",0,0,0,0,null,null,false,"",null); // big enigme => indice MDP
        NPC5 = new NPC("Smuggler",0,0,0,0,null,null,false,"",null); // Big seller (potion+++);
        NPC6 = new NPC("Princess",0,0,0,0,null,null,false,"",null); // princess
        
        // adding items
        /**monster1.getInventory().addObject(healthPotion);
        monster2.getInventory().addObject(sword);
        monster2.getInventory().addObject(shield);
        monster2.setWeaponEquipped(sword);
        monster2.setArmorEquipped(shield);
        friend1.getInventory().addObject(axe);
        friend1.setWeaponEquipped(axe);
        seller1.getInventory().addObject(healthPotion);
        seller1.getInventory().addObject(sword);
        seller1.getInventory().addObject(shield);**/
        
        
        // Chest : name, m, sizeInv, pict
        chest1 = new Chest("Little Chest",25,50,null);
        chest1.getInventory().addObject(door3.getKey());
        chest2 = new Chest("Little Chest",25,50,null);
        chest3 = new Chest("Little Chest",25,50,null);
        chest3.getInventory().addObject(door13.getKey());
        chest4 = new Chest("Little Chest",25,50,null);
        chest5 = new Chest("Little Chest",25,50,null);
        chest6 = new Chest("Little Chest",25,50,null);
        chest7 = new Chest("Little Chest",25,50,null);
        chest8 = new Chest("Little Chest",25,50,null);
        
        // Player : name, strength, defense, money, sizeInv, weaponEquipped, armorEquipped, actuelRoom, icon
        if (nameP.equals("Babujhi")){
            str = 5;
            def = 5;
            mon = 5;
            inv = 5;
            play = null ;
            startWeap = new Weapon("",0,0,null);
        }else if(nameP.equals("Jonathan")){
            str = 5;
            def = 5;
            mon = 5;
            inv = 5;
            play = null ;
            startWeap = new Weapon("",0,0,null);
        }else if(nameP.equals("Marin")){
            str = 5;
            def = 5;
            mon = 5;
            inv = 5;
            play = null ;
            startWeap = new Weapon("",0,0,null);
        }else if(nameP.equals("Clément")){
            str = 5;
            def = 5;
            mon = 5;
            inv = 5;
            play = null ;
            startWeap = new Weapon("",0,0,null);
        }else if(nameP.equals("Marion")){
            str = 5;
            def = 5;
            mon = 5;
            inv = 5;
            play = null ;
            startWeap = new Weapon("",0,0,null);
        }else if(nameP.equals("Paul")){
            str = 5;
            def = 5;
            mon = 5;
            inv = 5;
            play = null ;
            startWeap = new Weapon("",0,0,null);
        }
        myPlayer = new Player(nameP,str,def,mon,inv,null,null,room1,play);
        myPlayer.getInventory().addObject(shield2);
        myPlayer.getInventory().addObject(startWeap);
        /**myPlayer.getInventory().addObject(axe2);
        myPlayer.getInventory().addObject(axe);
        myPlayer.getInventory().addObject(healthPotion);
        myPlayer.getInventory().addObject(sword);
        myPlayer.getInventory().addObject(shield);
        myPlayer.getInventory().addObject(poisonPotion);
        myPlayer.getInventory().addObject(door1.getKey());
        myPlayer.setWeaponEquipped(axe2);**/
        myPlayer.setWeaponEquipped(startWeap);
        myPlayer.setArmorEquipped(shield2);
        
        // Adding NPC in room
        room1.addNPC(NPC1);
        room4.addNPC(NPC1);
        room9.addNPC(NPC5);
        room10.addNPC(NPC4);
        room12.addNPC(NPC2);
        room14.addNPC(NPC3);
        room17.addNPC(NPC6);
        
        // Adding monster in room
        room1.addNPC(monst1);
        room3.addNPC(monst1);
        room5.addNPC(monst2);
        room11.addNPC(monst3);
        room11.addNPC(monst4);
        room13.addNPC(monst5);
        room18.addNPC(monst6);
        room18.addNPC(monst7);
        room19.addNPC(monst14);
        room15.addNPC(monst8);
        room8.addNPC(monst9);
        room8.addNPC(monst10);
        room8.addNPC(monst11);
        room20.addNPC(monst12);
        room16.addNPC(monst13);
        
        // Adding Chest in room
        room1.addChest(chest1);
        room2.addChest(chest1);
        room4.addChest(chest2);
        room15.addChest(chest3);
        room10.addChest(chest4);
        room7.addChest(chest5);
        room7.addChest(chest6);
        room7.addChest(chest7);
        room7.addChest(chest8);
        
        // HashMap rooms
        room1.setExit("North",door2);
        room1.setExit("South",door1);
        
        room2.setExit("North", door3);
        room2.setExit("South",door2b);
        
        room3.setExit("North",door4);
        room3.setExit("South",door3b);
        
        room4.setExit("East",door5);
        room4.setExit("South",door4b);
        
        room5.setExit("East",door8);
        room5.setExit("South",door7);
        room5.setExit("West",door5b);
        
        room6.setExit("North",door7b);
        room6.setExit("East",door9);
        
        room7.setExit("South",door6b);
        
        room8.setExit("North",door6);
        room8.setExit("East",door19b);
        
        room9.setExit("North",door18b);
        room9.setExit("East",door20);
        room9.setExit("West",door19);
        
        room10.setExit("East",door17b);
        room10.setExit("South",door18);
        
        room11.setExit("West",door9b);
        
        room12.setExit("East",door10);
        room12.setExit("West",door8b);
        
        room13.setExit("South",door11);
        room13.setExit("West",door10b);
        
        room14.setExit("North",door11b);
        room14.setExit("East",door12);
        
        room15.setExit("East",door16b);
        room15.setExit("West",door17);
        
        room16.setExit("East",door15);
        room16.setExit("West",door20b);
        
        room17.setExit("West",door15b);
        
        room18.setExit("North",door14b);
        room18.setExit("West",door16);
        
        room19.setExit("North",door13);
        room19.setExit("South",door14);
        room19.setExit("West",door12b);
        
        room20.setExit("South",door13b);
        
        // launch game
        //InterfaceTest3 obj_game = new InterfaceTest3(myPlayer,arrayListRoom);
        new Game(myPlayer,arrayListRoom);

       // new InterfaceDialogue2(NPC1);
        
    }
    
    
}
