package javaapplication2;

/*

 */
public class Armor extends Item {
    private int defense;

public Armor(String nI, Inventaire inve, int px){
    super(nI, inve, px);
    
}
    public void use(Character character){}

public int getDefense(){
return defense;
}

}
