/*
 * This class that inherite from the character class represent the character that will be playable
 */
package javaapplication2;

/**
 *
 * @author Marin
 */
public class Player{
    private int karmaBar = 50;
    
    
    public Player()
    {
    }
    
    public int getKarma(){
        return karmaBar;
    }

    private void setKarma(int k){
        karmaBar=k;
    }
    
    /*
    * This method allow to add 10 points to the karma bar of the player
    */   
    public void add10Karma()
    {
        if(karmaBar >= 90)
        {
            setKarma(100);
        }
        else setKarma(karmaBar+10);
    }
    
    
    /*
    * This method allow to delete 10 points to the karma bar of the player
    */
    public void del10Karma()
    {
        if(karmaBar <= 10)
        {
            setKarma(0);
        }
        else setKarma(karmaBar-10);
    }
}