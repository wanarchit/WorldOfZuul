/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Marin
 */
public class Player {
    private int barreKarma;
    
    
    public Player(){
    }
    
    public int getKarma(){
        return barreKarma;
    }

    private void setKarma(int k){
        barreKarma=k;
    }
    
}