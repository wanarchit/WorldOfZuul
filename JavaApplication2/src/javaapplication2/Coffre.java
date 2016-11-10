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
public class Coffre extends Item{
    
    private Room actualRoom;
    private int argent;
    private Inventaire inv;
    
    
    private Coffre(String nI, Inventaire inve, int px){
        super(nI, inve, px);
    }
    
    private void setArgent(){
        
    }
    
    private int getArgent(){
        return argent;
    }
    
    private void setInventaire(){
    }
    
    private Inventaire getInventaire(){
        return inv;
    }

}

