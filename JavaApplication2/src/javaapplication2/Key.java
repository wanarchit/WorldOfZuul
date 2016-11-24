package javaapplication2;

/**
* The key is an item and it can unlock door.
 * @author Marion, Clément
 * version 22/11/2016
 */
public class Key extends Item{
    
    private LockedDoor nameDoor;
    private Key key;
    
    /**
     * Constructor of the key Class
     * @param nI Item name, here key name
     * @param pc the price of the item
     * @param d1 the door the key opens
     */
public Key(String nI, int pc, LockedDoor d1){
    super(nI, pc);
    nameDoor=d1;
}
/**
 * use a key to unlock a door.
 */
    public void use(){
        
    }

/**
 * Get the door opens by the key
 * @return the lockedDoor the key opens
 */
public LockedDoor getDoor(){
    return nameDoor;
}

public Key getKey(){
    
    return key;
}

}