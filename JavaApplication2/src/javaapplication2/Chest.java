package javaapplication2;

public class Chest {
    
    private int money;
    private Inventory inv;
    private String nameChest;
    
    public Chest(String name, int m){
        money = m;
        nameChest = name;
        inv = new Inventory(5);
    }
    
    private void setMoney()
    {  
    }
    
    public int getMoney() 
    {
        return money;
    }
    
    public String getNameChest()
    {
        return nameChest;
    }
    
    public void setInventaire()
    {
    }
    
    public Inventory getInventory()
    {
        return inv;
    }
}

