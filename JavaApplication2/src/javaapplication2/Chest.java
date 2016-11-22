/*
*This class allows the creation of a chest which is an object which is used by the character 
* @Marion & Clément
* version 22/11/2016
*/
package javaapplication2;

public class Chest {
    
    private int money;//the money contained in the chest.
    private Inventory inv; // inventary presents in the chest created
    private String nameChest; // name of the chest created
    
    //Constructor which allows the creation of the chest
    public Chest(String name, int m){
        money = m;
        nameChest = name;
        inv = new Inventory(5);
    }
    
    //method which allows to change the money in the chest
    private void setMoney()
    {  
    }
    
    //method which returns the money in the chest 
    public int getMoney() 
    {
        return money;
    }
    
    //method which returns the name of the chest 
    public String getNameChest()
    {
        return nameChest;
    }
    
    //method which allows the modification of the inventory, for example to modify the list 
    public void setInventory()
    {
    }
    
    //method which returns the inventory presents in the chest 
    public Inventory getInventory()
    {
        return inv;
    }
}

