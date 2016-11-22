/*
*
*/
package javaapplication2;

public class Item {
    private  String nameItem;
    private Inventory inv;
    private int price;    

public Item(String nI, Inventory inve, int pc){
    nameItem=nI;
    inv= inve;
    price=pc;
}

public void use()
{
}


public int getPrice()
{
return price;
}
}
