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
public class InterfaceTest3 extends JFrame implements ActionListener{
    
    private JFrame myFrame;
    private JButton myButton;
    private JButton arrayButton[];
    private InterfaceBattle myPanelBattle;
    private InterfaceSeller myPanelSeller;
    private JPanel myPanel, myPanelBars, myPanelG, myPanelRoom;
    private Player p;
    private int nbNPC, nbChest, nbDoor;
    private KarmaBar karmaB;
    private LifeBar lifeB;
    private Room roomActu;
    private ArrayList<NPC> npcRoom; // List of NPC in the actual Room
    private ArrayList<Chest> chestRoom; // List of Chests in the actual room
    private HashMap <String, Door> exit; // List of exit (door + name) in the actual room
    private boolean activeFight = false;
    private NPC npc = null;
    private InterfaceInventory inventoryFrame;
    
    public InterfaceTest3(Player myPlayer){
        p = myPlayer;
        roomActu = p.getActualRoom();
        npcRoom = roomActu.getNPCRoom();
        chestRoom = roomActu.getChestRoom();
        exit = roomActu.getHashMap();
        nbNPC = npcRoom.size();
        nbChest = chestRoom.size();
        nbDoor = exit.size();
        
        arrayButton = new JButton[nbNPC];
        
        for (int i =0;i<nbNPC;i++){
            arrayButton[i] = new JButton(npcRoom.get(i).getName());
        }
        
        //enemy = enemyNPC;
        // my Button
        myButton = new JButton("Inventory");
        myPanel = new JPanel();
        myPanel.setLayout(new BorderLayout());
        myPanel.add(myButton,BorderLayout.EAST);
        
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
        
        
        myPanelRoom = new JPanel();
        for (int i =0;i<nbNPC;i++){
            myPanelRoom.add(arrayButton[i]);
        }
        
        // Global Panel
        myPanelG= new JPanel();
        myPanelG.setLayout(new BorderLayout());
        myPanelG.add(myPanel,BorderLayout.SOUTH);
        myPanelG.add(myPanelBars,BorderLayout.NORTH);
        myPanelG.add(myPanelRoom,BorderLayout.CENTER);
//        myPanelG.add(myPanelBattle,BorderLayout.EAST);
        
        // myFrame
        myFrame = new JFrame("My Interface Test2");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setPreferredSize(new Dimension(750,550));
        
        myFrame.add(myPanelG);
        myFrame.pack();
        myFrame.setVisible(true);
        
        myButton.addActionListener(this);
        
        for (int i =0;i<nbNPC;i++){
            arrayButton[i].addActionListener(this);
        }
    }
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource().equals(myButton)){
            InterfaceInventory inventoryFrame = new InterfaceInventory(p,npc,this);   
        }
        for (int i =0;i<nbNPC;i++){
            if (e.getSource() == arrayButton[i]){
                npc = npcRoom.get(i);
                if (npc.isHostile()){
                    activeFight = true;
                    myPanelBattle = new InterfaceBattle(p,npc,this);
                    myPanelG.add(myPanelBattle,BorderLayout.EAST);
                    for (int j =0;j<nbNPC;j++){
                         arrayButton[j].setEnabled(false);  
                    }
                    myFrame.revalidate();
                }else{
                    myPanelSeller = new InterfaceSeller(p,npc,this);
                    myPanelG.add(myPanelSeller,BorderLayout.EAST);
                    myFrame.revalidate();
                }
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
    
    public JButton[] getNPCButton(){
        return arrayButton;
    }
    
    public int getNbNPC(){
        return nbNPC;
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
}
