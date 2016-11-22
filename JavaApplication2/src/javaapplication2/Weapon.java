package javaapplication2;

public class Weapon extends Item {
    private int damage;


public Weapon(String nI, Inventory inve, int pc, int dg){
    super(nI, inve, pc);
    damage = dg;
}

public void use(Character cha){}

public int getDamage(){
    return damage;
}
}
