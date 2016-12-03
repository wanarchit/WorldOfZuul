package javaapplication2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Set;
import java.util.*;

/**
 *
 * @author Paul
 */
public class Game extends JFrame implements ActionListener{
    
    private JFrame myFrame,myFrame2;
    private JButton myButton,myButton2;
    private JButton arrayButton[],arrayButton2[];
    private InterfaceBattle myPanelBattle;
    private InterfaceSeller myPanelSeller;
    private InterfaceChest myPanelChest;
    private JPanel myPanel, myPanelBars, myPanelG, myPanelRoom;
    private Player p;
    private int nbNPC, nbChest, nbDoor;
    private KarmaBar karmaB;
    private LifeBar lifeB;
    private Room roomActu;
    private ArrayList<NPC> npcRoom; // List of NPC in the actual Room
    private ArrayList<Chest> chestRoom; // List of Chests in the actual room
    private ArrayList<Room> arrayListRoom;
    private HashMap <String, Door> exit; // List of exit (door + name) in the actual room
    private boolean activeFight = false;
    private NPC npc = null;
    private Chest chest =null;
    private Boolean isSeller;
    //private Graphique graph;
    private JPanel pan;
    private Graphique graFct;
    
    public Game(Player myPlayer, ArrayList<Room> listRoom){
        p = myPlayer;
        roomActu = p.getActualRoom();
        npcRoom = roomActu.getNPCRoom();
        chestRoom = roomActu.getChestRoom();
        arrayListRoom = listRoom;
        exit = roomActu.getHashMap();
        nbNPC = npcRoom.size();
        nbChest = chestRoom.size();
        nbDoor = exit.size();
        

        
        //enemy = enemyNPC;
        // my Button
        myButton = new JButton("Inventory");
        myButton2 = new JButton("Map");
        myPanel = new JPanel();
        myPanel.setLayout(new BorderLayout());
        myPanel.add(myButton,BorderLayout.EAST);
        myPanel.add(myButton2,BorderLayout.WEST);
        
        
        
        myPanelBars = new JPanel();
        myPanelBars.setLayout(new BorderLayout());
        lifeB = new LifeBar();
        lifeB.setValueBar(p.getHP());
        karmaB = new KarmaBar();
        karmaB.setValueBar(p.getKarma());
        myPanelBars.add(lifeB.getLifeBar(),BorderLayout.EAST);
        myPanelBars.add(karmaB.getKarmaBar(),BorderLayout.WEST);
        
        //myPanelBattle = new InterfaceBattle(p,enemy,lifeB);
        //myPanelBattle.setVisible(false);
        
        
        Graphique graph = new Graphique(myPlayer,this);
        graFct=graph;
        pan=graph.getPanel();
        // Global Panel
        myPanelG= new JPanel();
        myPanelG.setLayout(new BorderLayout());
        myPanelG.add(myPanel,BorderLayout.SOUTH);
        myPanelG.add(myPanelBars,BorderLayout.NORTH);
        myPanelG.add(pan,BorderLayout.CENTER);
//        myPanelG.add(myPanelBattle,BorderLayout.EAST);
        
        // myFrame
        myFrame = new JFrame("My Interface Test2");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setPreferredSize(new Dimension(750,550));
        
        myFrame.add(myPanelG);
        myFrame.pack();
        myFrame.setVisible(true);
        
        myButton.addActionListener(this);
        myButton2.addActionListener(this);

    }
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource().equals(myButton)){
            InterfaceInventory inventoryFrame = new InterfaceInventory(p,npc,this);   
        }else if (e.getSource().equals(myButton2)){
            InterfaceMap mapFrame = new InterfaceMap(p,arrayListRoom);
        }
        for (int i =0;i<nbNPC;i++){
            if (e.getSource() == arrayButton[i]){
                npc = npcRoom.get(i);
                if (npc.isHostile()){
                    isSeller = false;
                    activeFight = true;
                    myPanelBattle = new InterfaceBattle(p,npc,this);
                    myPanelG.add(myPanelBattle,BorderLayout.EAST);
                    for (int j =0;j<nbNPC;j++){
                         arrayButton[j].setEnabled(false);  
                    }
                    for (int j =0;j<nbChest;j++){
                         arrayButton2[j].setEnabled(false);  
                    }
                    myFrame.revalidate();
                }else{
                    isSeller = true;
                    myPanelSeller = new InterfaceSeller(p,npc,this);
                    myPanelG.add(myPanelSeller,BorderLayout.EAST);
                    myFrame.revalidate();
                    for (int j =0;j<nbNPC;j++){
                         arrayButton[j].setEnabled(false);  
                    }
                    for (int j =0;j<nbChest;j++){
                         arrayButton2[j].setEnabled(false);  
                    }
                }
            }
        }
            for (int i =0;i<nbChest;i++){
                if (e.getSource() == arrayButton2[i]){
                    chest = chestRoom.get(i);
                    myPanelChest = new InterfaceChest(p,chest,this);
                    myPanelG.add(myPanelChest,BorderLayout.EAST);
                    for (int j =0;j<nbNPC;j++){
                         arrayButton[j].setEnabled(false);  
                    }
                    for (int j =0;j<nbChest;j++){
                         arrayButton2[j].setEnabled(false);  
                    }
                    myFrame.revalidate();
                }
            }
            
            
                   
    }
    
    public LifeBar getLifeBar(){
        return lifeB;
    }
    
    
    public KarmaBar getKarmaBar(){
        return karmaB;
    }

    public JFrame getMainFrame(){
        return myFrame;
    }
    
   
    
    public JButton[] getChestButton(){
        return arrayButton2;
    }
    
    public int getNbNPC(){
        return nbNPC;
    }
    
    public int getNbChest(){
        return nbChest;
    }
    
    public boolean getActiveFight(){
        return activeFight;
    }
    
    public void setActiveFight(boolean choice){
        activeFight=choice;
    }
    
    public NPC getEnemyActive(){
        return npc;
    }
    
    public InterfaceBattle getInterfaceBattle(){
        return myPanelBattle;
    }
    
    public void setInterfaceBattle(NPC enemyNPC){
        npc = enemyNPC;
        myPanelBattle = new InterfaceBattle(p,npc,this);
        myPanelG.add(myPanelBattle,BorderLayout.EAST);
        myPanelG.setVisible(true);
    }
    
    public JPanel getPanelEast(){
        return myPanelG;
    }
    
    public Boolean isSeller(){
        return isSeller;
    }
    
    public Graphique getGameGrid(){
        return graFct;
    }
}
