/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/*
 *
 * @author Clement
 */
public class Consommable extends Item{

private int bonus;


/*
 *Constructor of the consommable
 */
public Consommable(String nI, Inventaire inve, int px){
    super(nI, inve, px);
}

public void use(Personnage pers) {
}

public int getBonus(){
    return bonus;
}
}
