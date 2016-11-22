
import javaapplication2.Inventory;
import javaapplication2.Item;
import javaapplication2.LockedDoor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saspaanithy
 */
public class Key extends Item{
    private LockedDoor nameDoor;


public Key(String nI, Inventory inve, int pc){
super(nI, inve, pc);}

    public void use(){}

public LockedDoor getDoor(){
return nameDoor;
}

}