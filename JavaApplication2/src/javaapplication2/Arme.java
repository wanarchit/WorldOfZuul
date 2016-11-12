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
public class Arme extends Item {
    private int degats;


public Arme(String nI, Inventaire inve, int px, int dg){
    super(nI, inve, px);
    degats = dg;
}

    Arme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Arme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void use(Personnage pers){}

public int getDegat(){
return degats;
}

}