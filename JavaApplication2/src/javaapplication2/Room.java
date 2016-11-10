/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Marin
 */
public class Room {
    private boolean clear;
    private ArrayList<PNJ> persoRoom;
    private String nomRoom;
    private HashMap <String, Room> sorties;


public Room(){}

public boolean isClear(){
return clear;
}

public String getNomRoom(){
return nomRoom;}

public void setClear(){}

public void setExit(String s, Room r){}

}