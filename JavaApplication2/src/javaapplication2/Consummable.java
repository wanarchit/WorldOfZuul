package javaapplication2;

public class Consummable extends Item{
    private int bonus;

public Consummable(String nI, Inventory inve, int px, int bns){
    super(nI, inve, px);
    bonus = bns;
        
}

public void use(Character character){}

public int getBonus(){
    return bonus;
}
}

    