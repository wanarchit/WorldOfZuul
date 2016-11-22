/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class allows to handle Room. Each Room has a name,a set of character, 
 * there is possibility that the room has chests in it. Each room has one or 
 * several exits in it. Finally it is possible to set a room as clear or not.
 * @author Jonathan, Babujhi
 */
public class Room {
    private boolean clear;
    private ArrayList<PNJ> characterRoom;
    private ArrayList<Chest> chestRoom;
    private String nameRoom;
    private HashMap <String, Door> exit;


    /**
     * Constructor of a Room
     * @param name if there is no name, it automatically set to "Room"
     */
    public Room(String name){
        
    }

    /**
     * Get if the room is clear (true : clear, false : not clear)
     * @return a boolean depending if the room is clear or not
     */
    public boolean isClear(){
        
    }

    /**
     * Get the name of the Room
     * @return a String, the name of the Room
     */
    public String getNomRoom(){
        
    }

    /**
     * Allows to modify the parameter clear, which is a boolean. If the boolean is 
     * true it becomes false and vice versa.
     */
    public void setClear(){
        
    }

    /**
     * Create a new exit and put it in the exit Hashmap. If the name is empty, it is 
     * set to "North".
     * @param s the direction of the exit
     * @param d a Door between two Rooms (knows actual and next room)
     */
    public void setExit(String s, Door d){
        
    }
    
}