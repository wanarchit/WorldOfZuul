package javaapplication2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saspaanithy
 */
public class Door {
    
    boolean locked;
    Room nextRoom;
    Room actualRoom;
    boolean L = false; 
  
// Test par creation d'une porte 
public Door(){    
    locked = true;
    }
// **************************    

    public boolean getLocked(){
        return locked;
    }

    public void setLocked(){
        if(L == false){
            locked = false;
        }
        
        else{
            locked = true;
        }
        
    }

    public Room getNextRoom(){
        return nextRoom;
    }

    public Room getActualRoom(){
        return actualRoom;
    }


         
            
}
