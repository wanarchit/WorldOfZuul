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
    
    private Key clef;
    private String name;
     
    
    /**
    * This constructor allowed the creation of a Locked Door
     * @param name
    */   
    
    public LockedDoor(boolean l, Room actual, Room next, String n, Key c){
        super(l,actual,next);
        name = n;
        clef = c;
    }

    

    /**
    * @return a boolean 
    * This method allowed to check if the Key of the player can open a locked door
    *  If key and the door as the same name, the method open the lockedDoor.
    */
    
    public boolean checkKey(){
        return true;
        }
    
    /**
     *
     * @return
     */
    public Key getKey(key c){
    
        clef =c;
    }
    
    public String getName(String n){
        name = n;
    }
    
}

