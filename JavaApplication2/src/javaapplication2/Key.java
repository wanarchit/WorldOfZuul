package javaapplication2;

public class Key extends Item{
    private LockedDoor nameDoor;

public Key(String nI, Inventory inve, int pc, LockedDoor d1)
{
    super(nI, inve, pc);
    nameDoor=d1;
}

public void use(){}

public LockedDoor getDoor(){
    return nameDoor;
}
}