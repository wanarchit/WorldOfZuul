package javaapplication2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan, Babujhi
 */


public class MagicDoor {
    String pwd; 
    
/* The constructor allowed the creation of a MagicDoor
 * The magic door is closed and can only be open thanks to a code.
*/

    /**
     *
     */

    public MagicDoor()
{
    
}

    /*
    The method resolve allowed the user to enter a string and compare the pwd
    with the code of the Magic door.
    */
    
    /**
     * @param pwd
     * @return boolean
     */
    
    public boolean resolve (String pwd) {
        
        if (pwd.equals("")){
        return true;
        
        }
        else{
        return false;
        }
    }
}