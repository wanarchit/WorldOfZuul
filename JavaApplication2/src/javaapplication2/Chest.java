package javaapplication2;

public class Chest {
    
    private int money;
    private Inventory inv;
    private String nameChest;
    
    public Chest(String name, Inventory inv1, int m){
        money = m;
        inv = inv1;
        nameChest = name;
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

