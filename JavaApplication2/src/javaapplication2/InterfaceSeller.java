/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Paul
 */
public class InterfaceSeller extends JPanel implements ActionListener{
    
    //private JPanel ? ;
    private JLabel labelName, labelText;
    private JButton trade, end, attack, speak;
    private Player p;
    private NPC seller;

    private Game mainFrame;
    
    public InterfaceSeller(Player myPlayer, NPC enemyNPC, Game frame){
        p = myPlayer;
        seller = enemyNPC;
        mainFrame = frame;
        
        
       // myPanelBattle.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setLayout(new GridLayout(6,1));
        GridBagConstraints gbc = new GridBagConstraints();
        labelName = new JLabel("NPC name : "+seller.getName());
        labelName.setHorizontalAlignment(JLabel.CENTER);     
        labelText = new JLabel("");
        labelText.setHorizontalAlignment(JLabel.CENTER);
        
        speak = new JButton("Speak");
        trade = new JButton("Trade");
        attack = new JButton("Attack");
        end = new JButton("Close");

        this.add(labelName);
        this.add(labelText);
        this.add(speak);
        this.add(trade);
        this.add(attack);
        this.add(end);
        //this.setVisible(false);
        
       // attack.addActionListener(this);
        trade.addActionListener(this);
        //beat.addActionListener(this);
        //escape.addActionListener(this);
        end.addActionListener(this);
        //search.addActionListener(this);
    }
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource().equals(attack)){
            
    
        }else if (e.getSource().equals(end)){
            this.setVisible(false);
            JButton[] arrayButtons = mainFrame.getGameGrid().getNPCButton();
            for (int j =0;j<mainFrame.getNbNPC();j++){
                arrayButtons[j].setEnabled(true);  
            }
            mainFrame.setActiveFight(false);
            
        
        
        }else if (e.getSource().equals(trade)){
            new InterfaceTrade(p,seller);
        }
                
                
    }
}

    

