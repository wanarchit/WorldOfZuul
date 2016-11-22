package javaapplication2;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saspaanithy
 */
public class Inventory {
    private ArrayList<Item> inv;
    private int size;
    private Character character;


public Inventory(int s, Character c){
size=s;
character=c;
}


public void setSize(){}

public int getSize(){
return size;
}

public void addObject(Item i){}

public void deleteObject(Item i){}

}

