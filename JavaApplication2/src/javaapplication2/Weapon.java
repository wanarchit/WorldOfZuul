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
public class Weapon extends Item {
    private int damage;


public Weapon(String nI, Inventory inve, int pc, int dg){
    super(nI, inve, pc);
    damage = dg;
}

    Weapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Weapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void use(Character cha){}

public int getDamage(){
return damage;
}

}
