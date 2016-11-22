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


public Weapon(String nI, Inventaire inve, int px, int dg){
    super(nI, inve, px);
    damage = dg;
}

    Weapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Weapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void use(Personnage pers){}

public int getDamage(){
return damage;
}

}
