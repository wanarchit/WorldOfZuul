package javaapplication2;

/*

 */
public class Armor extends Item {
    private int defense;

public Armor(String nI, Inventory inve, int px, int def){
    super(nI, inve, px);
    defense = def;
    
}

public void use(Character character){}

public int getDefense(){
return defense;
}

}
