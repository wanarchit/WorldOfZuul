package javaapplication2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Marin
 */
public class PNJ {
    private boolean hostile;
    private String parole; 
    
    public PNJ(){
    }
    
    
    public String getParole(){
    return parole;
    }
   
    
    public boolean isHostile(){
        return hostile;
    }
    
    public void setHostile(boolean host){
        hostile=host;
    }
    
}
