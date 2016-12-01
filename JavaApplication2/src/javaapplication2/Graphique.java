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
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Graphique extends JFrame implements ActionListener {
private Room actRoom;
private HashMap <String, Door> roomHM;
private boolean north,south,east,west;
private JButton doorSouth,doorNorth,doorWest,doorEast;
private Player mPlayer;
private JFrame frame;
private JPanel gameGrid;
private JButton arrayButton[];
private JButton arrayChest[];
private int i=0; // NCP counter
private int c=0; // Chest counter
private int nbButt=0;
private ArrayList<NPC> listNPC;

    public JPanel Affiche(Player myPlayer) {
        mPlayer=myPlayer;
        listNPC=myPlayer.getActualRoom().getNPCRoom();
        //final ImageIcon backgroundImage = new ImageIcon("C:/imgWoZ/ground.jpg");
        //JLabel gameGrid = new JLabel(backgroundImage) {
        //};
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

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
        arrayButton = new JButton[myPlayer.getActualRoom().getNPCRoom().size()];
        arrayChest = new JButton[myPlayer.getActualRoom().getChestRoom().size()];
        for(int j=0; j< myPlayer.getActualRoom().getNPCRoom().size(); j++){
            System.out.println("NPC"+j);           
        }
        //------------------------Adding NPC------------------------------------
 
        //--------------------
        for(int row=0; row < 5; row ++){
            for(int col=0; col < 5; col ++){
        //----------------------------------------------------------------------
        //-----------------------------Adding Doors-----------------------------
                if(south==true && row==4 && col==2)
                {
                    ImageIcon porte = new ImageIcon(new ImageIcon("C:/imgWoz/porte1.jpg").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                    doorSouth = new JButton(porte);
                    doorSouth.setPreferredSize(new Dimension(100,100));
                    doorSouth.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(doorSouth);
                    myPlayer.setActualRoom(roomHM.get("South").getNextRoom());
                    doorSouth.addActionListener(this);
                    System.out.println(this.getComponentZOrder(doorSouth));
                    
                    
                }
                else if(north==true && row==0 && col==2)
                {
                    ImageIcon porte = new ImageIcon(new ImageIcon("C:/imgWoz/porte1.jpg").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                    JButton button = new JButton(porte);
                    button.setPreferredSize(new Dimension(100,100));
                    button.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(button);
                }
                else if(west==true && row==2 && col==0)
                {
                    ImageIcon porte = new ImageIcon(new ImageIcon("C:/imgWoz/porte1.jpg").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                    JButton button = new JButton(porte);
                    button.setPreferredSize(new Dimension(100,100));
                    button.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(button);
                    //System.out.println(doorWest.getX()+" "+doorWest.getY());
                }
                else if(east==true && row==2 && col==4)
                {
                    ImageIcon porte = new ImageIcon(new ImageIcon("C:/imgWoz/porte1.jpg").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                    JButton button = new JButton(porte);
                    button.setPreferredSize(new Dimension(100,100));
                    button.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(button);
                }
                else if( i < arrayButton.length && nbButt!=2 && nbButt!=10 && nbButt!=14 && nbButt!=22 ){
                    if(listNPC.get(i).isHostile()){
                        ImageIcon host = new ImageIcon(new ImageIcon("C:/imgWoz/monstre1.png").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                        arrayButton[i]= new JButton(host);
                        arrayButton[i].setPreferredSize(new Dimension(100,100));
                        arrayButton[i].setMinimumSize(new Dimension(100,100));
                        gameGrid.add(arrayButton[i]);
                        arrayButton[i].addActionListener(this);
                        i++;
                    }
                    else{
                        ImageIcon friendly = new ImageIcon(new ImageIcon("C:/imgWoz/friendly.jpg").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                        arrayButton[i] = new JButton(friendly);
                        arrayButton[i].setPreferredSize(new Dimension(100,100));
                        arrayButton[i].setMinimumSize(new Dimension(100,100));
                        gameGrid.add(arrayButton[i]);
                        arrayButton[i].addActionListener(this);
                        i++;
                    }
                }
                else if(c < arrayChest.length && nbButt!=2 && nbButt!=10 && nbButt!=14 && nbButt!=22){
                    ImageIcon chest= new ImageIcon(new ImageIcon("C:/imgWoz/chest.png").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                    arrayChest[c]= new JButton(chest);
                    arrayChest[c].setPreferredSize(new Dimension(100,100));
                    arrayChest[c].setMinimumSize(new Dimension(100,100));
                    gameGrid.add(arrayChest[c]);
                    arrayChest[c].addActionListener(this);
                    c++;
                }
                else{
                    
                    ImageIcon dalle1 = new ImageIcon(new ImageIcon("C:/imgWoz/dalleFinal.png").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                    JButton button2 = new JButton(dalle1);
                    button2.setPreferredSize(new Dimension(100,100));
                    button2.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(button2);
                }
                nbButt++;
            }
            
        }
        gameGrid.setPreferredSize(new Dimension(600,500));//largeur,hauteur
        gameGrid.setMinimumSize(new Dimension(600,500));
        this.add(gameGrid,BorderLayout.WEST);
        this.pack();
        this.setVisible(true);
        return gameGrid;
    }
     //--------------------------------------------------------------------------
    //----------------------ActionListener---------------------------
    public void actionPerformed (ActionEvent e){
         if (e.getSource().equals(doorSouth)){
            System.out.println("toto");
            Graphique newAffiche = new Graphique();
            gameGrid=newAffiche.Affiche(mPlayer);
            this.dispose();
            this.setContentPane(newAffiche.Affiche(mPlayer));
                     
        }

       
}
}
