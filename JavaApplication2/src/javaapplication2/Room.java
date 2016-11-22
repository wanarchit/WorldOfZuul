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
    private ArrayList<NPC> characterRoom; //pas deux fois le meme
    private ArrayList<Chest> chestRoom; // pas deux fois le meme
    private String nameRoom;
    private HashMap <String, Door> exit; //pas deux fois la meme porte


    /**
     * Constructor of a Room, the HashMap and the ArrayList are empty when the 
     * class is created.
     * @param name if there is no name, it automatically set to "Room"
     * @param empty set the boolean clear in the constructor
     */
    public Room(String name, boolean empty){
        
    }

    /**
     * Get if the room is clear (true : clear, false : not clear)
     * @return a boolean depending if the room is clear or not
     */
    public boolean isClear(){
        return false;
    }

    /**
     * Get the name of the Room
     * @return a String, the name of the Room
     */
    public String getNameRoom(){
        return null;
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
    
    /**
     * Add a NPC in the ArrayList characterRoom
     * @param n a NPC who is in the room
     */
    public void addNPC (NPC n) {
        
    } 
    
    /**
     * Add a Chest in the ArrayList chestRoom
     * @param c a Chest which is in the Room
     */
    public void addChest (Chest c) {
        
    }
    
    /**
     * Get a NPC in the ArrayList
     * @param i the number of the line of the List
     * @return a NPC
     */
    public NPC getLineNPCList(int i){
        
    }
    
    /**
     * Get a Chest in the ArrayList
     * @param i the number of the line of the List
     * @return a Chest
     */
    public Chest getLineChestList(int i){
        
    }
    
    /**
     * Get the size of the Chest list
     * @return the size of the list
     */
    public int getSizeChestList() {
        
    }
    
    /**
     * Get the size of the NPC list
     * @return the size of the list
     */
    public int getSizeNPCList() {
        
    }
    
    /**
     * Get a Door in the HashMap
     * @param i the number of the line of the HashMap
     * @return a Door
     */
    public Door getHashMapLine(int i) {
        
    }
}