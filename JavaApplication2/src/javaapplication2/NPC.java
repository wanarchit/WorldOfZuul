package javaapplication2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Paul
 */
public class NPC {
    private boolean hostile;
    private String speech; 
    
    public NPC(){
    }
    
    
    public String getSpeech(){
    return speech;
    }
   
    
    public boolean isHostile(){
        return hostile;
    }
    
    public void setHostile(boolean host){
        hostile=host;
    }
    
}
