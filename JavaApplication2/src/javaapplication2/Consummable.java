/*
* This class allows the creation of an consummable object like food or drink  
* @Marion & Clément
* version 22/11/2016
*/
package javaapplication2;

//the class Consummable is a heiress class of the class Item.

/**
 *
 * @author Paul
 */
public class Consummable extends Item{
    private int bonus; // bonus is a specific attribut of consummable

    /**
     * Constructor of the consummable object, allows its creation
     * @param nI name of the inventary
     * @param inve inventary
     * @param px price 
     * @param bns bonus obtained thanks to the consummable
     */
public Consummable(String nI, Inventory inve, int px, int bns){
    super(nI, inve, px);
    bonus = bns; 
}

//the method allows Characters to drink or eat a consummable

    /**
     *
     * @param character
     */
public void use(Character character){}

//this method allows to returns the bonus obtained thanks to the consummable 

    /**
     *
     * @return
     */
public int getBonus(){
    return bonus;
}
}

    
