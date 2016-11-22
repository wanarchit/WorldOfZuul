/*
 * 
 * 
 * 
 */
package javaapplication2;

/**
 *
 * @author Marin
 */
public class Item {
    private  String nameItem;
    //private Img skin;
    private Inventory inv;
    private int price;    

public Item(String nI, Inventory inve, int pc){
    nameItem=nI;
    inv= inve;
    price=pc;
}

/**
 * 
 */
public void use(){}


/**
 * 
 * @return 
 */
public int getPrice(){
return price;
}

}
