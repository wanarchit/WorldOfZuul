/*
 * This class that inherite from the character class represent the character that will be playable
 */
package javaapplication2;

/**
 *
 * @author Marin
 */
public class Player extends Character
{
    private int karmaBar = 50;
    private Room actualRoom;
    
    
    public Player(String name,int stren, int def, int mon,int sizeInt, Weapon wea, Armor amo,Room r1)
    {
        super(name,stren,def,mon,sizeInt,wea,amo);
        actualRoom=r1;
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