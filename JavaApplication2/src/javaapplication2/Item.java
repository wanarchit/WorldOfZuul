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
    private String nomItem;
    //private Img skin;
    private Inventaire inv;
    private int prix;    

public Item(String nI, Inventaire inve, int px){
    nomItem=nI;
    inv= inve;
    prix=px;
}

public void use(){}

public int getPrix(){
return prix;
}

}
