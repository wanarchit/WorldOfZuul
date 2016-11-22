package javaapplication2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
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
    
    public Character(String nom,int stren, int def, int mon, Room r1){
        hP=100;
        namePerso=name;
        strength=stren;
        defense=def;
        money=mon;
        //inv = new Inventaire();
        actualRoom=r1;               
    }
    
    
    
    public void setInv(){
    
    }

    public Inventaire getInv(){
        return inv;
    }

    //public void echange(P1,P2){
        
    //}

    public int getHP(){
        return hP;
    }

    public void setHP( int nb){
    }

    public String getName(){
        return namePerso;
    }

    public Room getActualRoom(){
        return actualRoom;
    }

    public void setActualRoom(){
    }

    public int getForce(){
        return strength;
    }

    public int getDefense(){
        return defense;
    }

    public Arme getWeaponEquipped(){
        return weaponEquipped;
    }

    public void setWeaponEquipped(){
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(){
}

}
            
