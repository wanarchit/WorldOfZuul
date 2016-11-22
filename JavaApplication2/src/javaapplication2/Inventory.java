/*
 * The inventory is an object composed by a list of items.
 * It will be used in multiples context such as the player inventory of a chest inventory
 * It can be empty
 * @version 22/11/16
 * @author Marion
 */
package javaapplication2;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> inv; //Array list of item composing the inventory
    private int size; // size of the inventory (of the array list)

/**
 * Constructor for the inventory
 * @param s size of the inventory
 */
public Inventory(int s)
{
    size=s;
}
/**
 * Setter for the inventory size
 */
public void setSize()
{
}
/**
 * getter for the inventory size
 * @return int value of the inventory size
 */
public int getSize()
{
    return size;
}
/**
 * Method that allows to add an item to the inventory
 * @param i object added to the inventory
 */
public void addObject(Item i)
{
}
/**
 * Method that allows to delete an item from the inventory
 * @param i object deleted from the inventory
 */
public void deleteObject(Item i)
{
}

}

