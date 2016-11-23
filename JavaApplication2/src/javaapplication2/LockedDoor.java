package javaapplication2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Babujhi, Jonathan
 * 
 * This class allowed to have a Locked Door in a Room. 
 * The Locked door could be open thanks to a key. 
 */


public class LockedDoor extends Door {
    
    private final Key clef;
    private final String name;
    private final Inventory v;

     
    
    /**
    * This constructor allowed the creation of a Locked Door
     * @param l
     * @param actual
     * @param next
     * @param n
    */   
    
    public LockedDoor(boolean l, Room actual, Room next, String n){
        
        super(l,actual,next);
        name = n;
        v = new Inventory (5);           /// problem inventaire à mettre en paramètre peut être 
        clef = new Key ("First_key", v , 3);

        
    }

    

    /**
    * @return a boolean 
    * This method allowed to check if the Key of the player can open a locked door
    *  If key and the door as the same name, the method open the lockedDoor.
    */
    
    public boolean checkKey(){
        if (name.equals()){     // ajouter un getItems(Name) mais pour sa ajouter getItems dans la méthode items.
            return true;
        }
        else return false;
        }
    
    /**
     *
     * @return
     */
    public Key getKey(){
    
        return clef;
    }
    
    public String getName(){
       return name;
    }
}

