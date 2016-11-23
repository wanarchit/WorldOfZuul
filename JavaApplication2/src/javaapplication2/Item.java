/*
*
*/
package javaapplication2;

/**
 * The class Item
 * 
 * @author Marion
 * @version 22/11/2016 
 */
public class Item {
    // Name of item, it cannot be changed
    private final String nameItem;
    //Item must belong to an inventory (of character or chest)
    // So we add in inventory the item
    private Inventory inv;
    // Price of item, which will using for the sale of object.
    private int price;    

    /**
     * The constructor of Item with name parameter
     * @param nI it is the name of object
     * @param inve it is the inventory which will contain this object
     * @param pc  it is the price of this object
     */
public Item(String nI, Inventory inve, int pc){
    nameItem=nI;
    inv= inve;
    price=pc;
}

    /**
     *
     */
    public void use()
{
}

/**
 * Utility function which allow getting the price of object
 * @return price of object
 */
public int getPrice(){
    return price;
}

}
