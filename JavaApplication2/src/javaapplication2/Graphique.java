package javaapplication2;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Insets;
import java.net.MalformedURLException;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Graphique extends JPanel implements ActionListener {
private Room actRoom;
private HashMap <String, Door> roomHM;
private boolean north,south,east,west;
private JButton doorSouth,doorNorth,doorWest,doorEast;
private Player mPlayer;
private JFrame frame;
private JPanel gameGrid;
private JButton arrayButton[];
private JButton arrayChest[];
private int nbPos=0; //Number of objects to add to the gameGrid
private int i=0; // NCP counter
private int c=0; // Chest counter
private int cpt=0;
private ArrayList<NPC> listNPC;
private ArrayList<Chest> listCh;
private int min=0;
private int max=24;
private int rdVal;
private int nbNPC;
private int nbChest;
private NPC npc = null;
private boolean isSeller;
private boolean activeFight;
private InterfaceBattle myPanelBattle;
private InterfaceSeller myPanelSeller;
private Player myPlayer;
private Game myGame;
private int cptM,cptF,cptC=0;

    public Graphique(Player play,Game game){
        myGame = game;
        myPlayer = play;
        nbNPC = myPlayer.getActualRoom().getNPCRoom().size();
        nbChest = myPlayer.getActualRoom().getChestRoom().size();
        ArrayList<Integer> listHost = new ArrayList<Integer>();
        ArrayList<Integer> listFriend = new ArrayList<Integer>();
        ArrayList<Integer> listChest = new ArrayList<Integer>();
        
        
        listNPC=myPlayer.getActualRoom().getNPCRoom();
        listCh=myPlayer.getActualRoom().getChestRoom();
        //nbPos=(myPlayer.getActualRoom().getNPCRoom().size())+(myPlayer.getActualRoom().getChestRoom().size());


        //----------------------------------------------------------------------
        arrayButton = new JButton[myPlayer.getActualRoom().getNPCRoom().size()];
        arrayChest = new JButton[myPlayer.getActualRoom().getChestRoom().size()];
        //----------------------------------------------------------------------
        ArrayList<Integer> listPos = new ArrayList<Integer>();
        listPos.add(22);
        listPos.add(2);
        listPos.add(10);
        listPos.add(14);
        //----------------------------------------------------------------------
        //-----------------------------GAME GRID--------------------------------
        gameGrid = new JPanel();
        gameGrid.setLayout(new GridLayout(5,5));
        actRoom=myPlayer.getActualRoom();
        roomHM=actRoom.getHashMap();
        if(roomHM.containsKey("South")){
            south=true;
        }
        if(roomHM.containsKey("North")){
            north=true;
        }
        if(roomHM.containsKey("West")){
            west=true;
        }
        if(roomHM.containsKey("East")){
            east=true;
        }        

        //----------------------------------------------------------------------
        for(int cpt=0; cpt<listNPC.size();cpt++){
            rdVal=ThreadLocalRandom.current().nextInt(min, max + 1);
            while(listPos.contains(rdVal)){
                    rdVal=ThreadLocalRandom.current().nextInt(min, max + 1);
            }
            if(listNPC.get(cpt).isHostile()){                   
                listHost.add(rdVal);    
            }
            else{
                listFriend.add(rdVal);
            }
        }
        for(int cpt=0; cpt<listCh.size();cpt++){
            rdVal=ThreadLocalRandom.current().nextInt(min, max + 1);
            while(listPos.contains(rdVal)){
                    rdVal=ThreadLocalRandom.current().nextInt(min, max + 1);
            }
            listChest.add(rdVal);
        }
        //----------------------------------------------------------------------
        
        //---------------------------
        for(int nbButt=0; nbButt <25; nbButt++){
        //----------------------------------------------------------------------
        //-----------------------------Adding Doors-----------------------------
                if(south==true && nbButt==22)
                {
                    ImageIcon porte = new ImageIcon(new ImageIcon("images/dungeonDoor.png").getImage().getScaledInstance(190,190, Image.SCALE_DEFAULT));
                    doorSouth = new JButton(porte);
                    doorSouth.setPreferredSize(new Dimension(100,100));
                    doorSouth.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(doorSouth);
                    myPlayer.setActualRoom(roomHM.get("South").getNextRoom());
                    doorSouth.addActionListener(this);                   
                }
                else if(north==true && nbButt==2)
                {
                    ImageIcon porte = new ImageIcon(new ImageIcon("images/dungeonDoor.png").getImage().getScaledInstance(190,190, Image.SCALE_DEFAULT));
                    JButton doorNorth = new JButton(porte);
                    doorNorth.setPreferredSize(new Dimension(100,100));
                    doorNorth.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(doorNorth);
                    myPlayer.setActualRoom(roomHM.get("North").getNextRoom());
                    doorNorth.addActionListener(this);
                }
                else if(west==true && nbButt==10)
                {
                    ImageIcon porte = new ImageIcon(new ImageIcon("images/dungeonDoor.png").getImage().getScaledInstance(190,190, Image.SCALE_DEFAULT));
                    JButton doorWest = new JButton(porte);
                    doorWest.setPreferredSize(new Dimension(100,100));
                    doorWest.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(doorWest);
                    myPlayer.setActualRoom(roomHM.get("West").getNextRoom());
                    doorWest.addActionListener(this);
                }
                else if(east==true && nbButt==14)
                {
                    ImageIcon porte = new ImageIcon(new ImageIcon("images/dungeonDoor.png").getImage().getScaledInstance(190,190, Image.SCALE_DEFAULT));
                    JButton doorEast = new JButton(porte);
                    doorEast.setPreferredSize(new Dimension(100,100));
                    doorEast.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(doorEast);
                    myPlayer.setActualRoom(roomHM.get("East").getNextRoom());
                    doorEast.addActionListener(this);
                }
                
        //----------------------------------------------------------------------

                
        //-----------------------------Adding NPC-------------------------------
                else if(listHost.contains(nbButt)){
                        ImageIcon host = new ImageIcon(new ImageIcon("images/monstre1.png").getImage().getScaledInstance(190,190, Image.SCALE_DEFAULT));
                        arrayButton[cptM]= new JButton(host);
                        System.out.println(cptM);
                        arrayButton[cptM].setPreferredSize(new Dimension(100,100));
                        arrayButton[cptM].setMinimumSize(new Dimension(100,100));
                        gameGrid.add(arrayButton[cptM]);
                        arrayButton[cptM].addActionListener(this);
                        cptM++;
                    }
        //----------------------------------------------------------------------
        //-----------------------------Adding Friendly--------------------------            
                else if(listFriend.contains(nbButt)){
                        ImageIcon friendly = new ImageIcon(new ImageIcon("images/dungeonDwarf.png").getImage().getScaledInstance(190,190, Image.SCALE_DEFAULT));
                        arrayButton[cptM]= new JButton(friendly);
                        arrayButton[cptM].setPreferredSize(new Dimension(100,100));
                        arrayButton[cptM].setMinimumSize(new Dimension(100,100));
                        gameGrid.add(arrayButton[cptM]);
                        arrayButton[cptM].addActionListener(this);
                        cptM++;
                    }
        //----------------------------------------------------------------------
        //-----------------------------Adding Chests----------------------------        
                else if(listChest.contains(nbButt)){
                    ImageIcon chest= new ImageIcon(new ImageIcon("images/dungeonChest.png").getImage().getScaledInstance(190,190, Image.SCALE_DEFAULT));
                    arrayChest[cptC]= new JButton(chest);
                    arrayChest[cptC].setPreferredSize(new Dimension(100,100));
                    arrayChest[cptC].setMinimumSize(new Dimension(100,100));
                    gameGrid.add(arrayChest[cptC]);
                    arrayChest[cptC].addActionListener(this);
                    cptC++;
                }
        //----------------------------------------------------------------------
        //-----------------------------Adding Floor-----------------------------        
                else{   
                    ImageIcon dalle1 = new ImageIcon(new ImageIcon("images/dalleFinal.png").getImage().getScaledInstance(190,190, Image.SCALE_DEFAULT));
                    JButton button2 = new JButton(dalle1);
                    button2.setPreferredSize(new Dimension(100,100));
                    button2.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(button2);
                }
            }
    }
    public void actionPerformed (ActionEvent e){
        for (int i =0;i<nbNPC;i++){
            if (e.getSource() == arrayButton[i]){
                npc = listNPC.get(i);
                if (npc.isHostile()){
                    isSeller = false;
                    activeFight = true;
                    myPanelBattle = new InterfaceBattle(myPlayer,npc,myGame);
                    myGame.getPanelEast().add(myPanelBattle,BorderLayout.EAST);
                    for (int j =0;j<nbNPC;j++){
                         arrayButton[j].setEnabled(false);  
                    }
                    for (int j =0;j<nbChest;j++){
                         arrayChest[j].setEnabled(false);  
                    }
                    myGame.revalidate();
                }else{
                    isSeller = true;
                    myPanelSeller = new InterfaceSeller(myPlayer,npc,myGame);
                    myGame.getPanelEast().add(myPanelSeller,BorderLayout.EAST);
                    myGame.revalidate();
                    for (int j =0;j<nbNPC;j++){
                         arrayButton[j].setEnabled(false);
                    }
                    for (int j =0;j<nbChest;j++){
                         arrayChest[j].setEnabled(false);  
                    }
                }
            }
        }
    }
    
    public JPanel getPanel(){
        return gameGrid;
    }
    
     public JButton[] getNPCButton(){
        return arrayButton;
    }
}

        /**
        gameGrid.setPreferredSize(new Dimension(900,900));//largeur,hauteur
        gameGrid.setMinimumSize(new Dimension(900,900));
        this.add(gameGrid,BorderLayout.WEST);
        this.pack();
        this.setVisible(true);
        return gameGrid;
    }
     //--------------------------------------------------------------------------
    //----------------------ActionListener---------------------------
    //*public void actionPerformed (ActionEvent e){
         if (e.getSource().equals(doorSouth)){
            Graphique newAffiche = new Graphique();
            gameGrid=newAffiche.Affiche(mPlayer);
            this.dispose();
            this.setContentPane(newAffiche.Affiche(mPlayer));
         }
         else if (e.getSource().equals(doorNorth)){
            Graphique newAffiche = new Graphique();
            gameGrid=newAffiche.Affiche(mPlayer);
            this.dispose();
            this.setContentPane(newAffiche.Affiche(mPlayer));     
        }
        else if (e.getSource().equals(doorEast)){
            Graphique newAffiche = new Graphique();
            gameGrid=newAffiche.Affiche(mPlayer);
            this.dispose();
            this.setContentPane(newAffiche.Affiche(mPlayer));     
        }
        else if (e.getSource().equals(doorWest)){
            Graphique newAffiche = new Graphique();
            gameGrid=newAffiche.Affiche(mPlayer);
            this.dispose();
            this.setContentPane(newAffiche.Affiche(mPlayer));     
        }

     
        
}**/

