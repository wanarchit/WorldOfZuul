/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Marin
 */
public class Item {
    private String nameItem;
    //private Img skin;
    private Inventory inv;
    private int price;    

public Item(String nI, Inventory inve, int px){
    nameItem=nI;
    inv= inve;
    price=px;
}

public void use(){}

public int getPrice(){
return price;
}

}
