package javaapplication2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class allows to handle doors. Doors are the object between rooms so doors
 * knows the actual room and the room behind them. A door can be locked (physically
 * or magically).
 * 
 * @author Jonathan, Babujhi
 */
public class Door {
  
    /**
     * Constructor of a Door
     * @param l a boolean to set the door to locked or not
     * @param actual the room in which the door is
     * @param next the room behind the door
     */
    public Door(boolean l, Room actual, Room next){       
    }
    
    /**
     * get the boolean locked (true : the door is locked, false : it is not)
     * @return the boolean locked
     */
    public boolean getLocked(){  
        return false;
    }

    /**
     * Set the boolean locked to true or false, if it true it becomes false
     * and vice versa
     */
    public void setLocked(){    
    }

    /**
     * Get which Room is behind the door
     * @return the next Room
     */
    public Room getNextRoom(){
        return null; 
    }

    /**
     * Get in which room the door is.
     * @return the actual room
     */
    public Room getActualRoom(){  
        return null;
    }
}
