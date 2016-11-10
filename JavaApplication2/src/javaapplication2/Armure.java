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
public class Armure extends Item {
    private int defense;

public Armure(String nI, Inventaire inve, int px){
    super(nI, inve, px);
    
}
    public void use(Personnage pers){}

public int getDefense(){
return defense;
}

}
