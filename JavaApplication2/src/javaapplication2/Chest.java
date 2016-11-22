package javaapplication2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saspaanithy
 */
public class Chest extends Item{
    
    private Room actualRoom;
    private int money;
    private Inventory inv;
    
    
    public Chest(String nI, Inventory inve, int px, int m){
        super(nI, inve, px);
        money = m;
    }
    
    private void setMoney(){
        
    }
    
    public int getMoney() {
        return money;
    }
    
    public void setInventaire(){
    }
    
    public Inventory getInventory(){
        return inv;

}
}

