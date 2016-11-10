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
public class Personnage {
    private String nomPerso;
    private Room salleActu;
    // private Img Skin;
    private Inventaire inv;
    private int pV;
    private int force;
    private int defense;
    private Arme armeEquipee;
    private Armure armureEquipee;
    private int argent;
    
    
    
    
    public void setInv(){
    
    }

    public Inventaire getInv(){
        return inv;
    }

    //public void echange(P1,P2){
        
    //}

    public int getPV(){
        return pV;
    }

    public void setPV( int nb){
    }

    public String getNom(){
        return nomPerso;
    }

    public Room getSalleActu(){
        return salleActu;
    }

    public void setSalleActu(){
    }

    public int getForce(){
        return force;
    }

    public int getDefense(){
        return defense;
    }

    public Arme getArmeEquipee(){
        return armeEquipee;
    }

    public void setArmeEquipee(){
    }

    public int getArgent(){
        return argent;
    }

    public void setArgent(){
}

}
            
