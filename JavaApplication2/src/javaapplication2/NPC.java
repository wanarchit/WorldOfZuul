package javaapplication2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

/*
 * This class inherite from the character class
 * It will be used to implement NPC (none playable character) into our game
 */


/**
 *
 * @author Marin and Paul
 */
public class NPC extends Character
{
    //Attribute specific to this class
    private boolean hostile;//Define if the NPC is or isn't hostile to the player
    private String speech;// Contain the speech the NPC will deliver when interacting with it
    
//NPC Constructor
    /**
     * Constructor with name parameter
     * 
     * Stength and defense of character are using for battle
     * Money cannot be negative but has not positive limit
     * Armor and Weapon can be null at the begining
     * 
     * @param name : it is the name of character (NPC or Player)
     * @param stren : it is the strength point of the character
     * @param def : it is the defense point of the caracter
     * @param mon : it the money of character
     * @param r1 : it is the actual room where the character is
     * @param sizeInt : it is the size of inventory
     * @param wea : it is the weapon which is carried by character
     * @param amo : it is the armor which is carried by character
     * @param host: it is the boolean value defining if hostile or not
     * @param txt: it is the string value displayed when interacting with the NPC
     */    
    public NPC(String name,int stren, int def, int mon,int sizeInt, Weapon wea, Armor amo,boolean host,String txt)
    {
        super(name,stren,def,mon,sizeInt,wea,amo);
        hostile=host;
        speech=txt;
    }
    
/**
 * Give the speech value of the NPC
 * @return speech as string value
 */   
    public String getSpeech()
    {
        return speech;
    }
/**
 * Allows to change the displayed text by the NPC
 * @param NPC displayed text as string
 */
    public void setSpeech(String txt)
    {
      speech=txt;  
    }
/**
 * Allows to get the hostile value as a boolean
 * @return hostile as boolean value
 */
    public boolean isHostile(){
        return hostile;
    }
/** 
 * 
 * @param host as boolean value
 * Allows to set if an NPC is hostile or not
 */   
    public void setHostile(boolean host){
        hostile=host;
    }
    
}
