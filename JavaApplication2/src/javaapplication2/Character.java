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
  //  private Inventory inv;
    private int hP= 100;
    private int strength;
    private int defense;
   // private Weapon weaponEquipped;
  //  private Armor armorEquipped;
    private int money;
    
    public Character(String name,int stren, int def, int mon, Room r1){
        hP=100;
        namePerso=name;
        strength=stren;
        defense=def;
        money=mon;
       // inv = new Inventory();
        actualRoom=r1;               
    }
    
    
    
  //  private void setInv(){
    
   // }

   // public Inventaire getInv(){
    //    return inv;
   // }

    //public void echange(P1,P2){
        
    //}

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

//        return weaponEquipped;
 //   }

  //  private void setWeaponEquipped(){
 //   }

    public int getMoney(){
        return money;
    }

    public void setMoney(int newMoney){
        money = newMoney;
}

}
            
