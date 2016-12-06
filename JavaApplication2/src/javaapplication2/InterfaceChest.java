package javaapplication2;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Paul
 */
public class InterfaceChest extends JPanel implements ActionListener{
    
    //private JPanel ? ;
    private JLabel labelName, labelText;
    private JButton end, search;
    private Player p;
    private Chest myChest;

    private Game mainFrame;
    
    public InterfaceChest(Player myPlayer, Chest chest, Game frame){
        p = myPlayer;
        myChest = chest;
        mainFrame = frame;
        
        
       // myPanelBattle.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setLayout(new GridLayout(6,1));
        GridBagConstraints gbc = new GridBagConstraints();
        labelName = new JLabel("Chest name : "+myChest.getNameChest());
        labelName.setHorizontalAlignment(JLabel.CENTER);     
        labelText = new JLabel("");
        labelText.setHorizontalAlignment(JLabel.CENTER);
        
        search = new JButton("Search");
        end = new JButton("Close");

        this.add(labelName);
        this.add(labelText);
        this.add(search);
        this.add(end);
        //this.setVisible(false);
        
        search.addActionListener(this);
        end.addActionListener(this);
    }
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource().equals(search)){
            if (myChest.getMoney()!=0){
                JFrame messFrame = new JFrame();
                JOptionPane d = new JOptionPane();
                d.showMessageDialog(messFrame, "You earn "+myChest.getMoney()+" gold!", 
                "You earn money !", JOptionPane.INFORMATION_MESSAGE);
                p.setMoney(p.getMoney()+myChest.getMoney());
                myChest.setMoney(0);
            }
            new InterfaceTrade2(p,myChest);
    
        }else if (e.getSource().equals(end)){
            this.setVisible(false);
           // JButton[] arrayButtons = mainFrame.getNPCButton();
            for (int j =0;j<mainFrame.getNbNPC();j++){
          //      arrayButtons[j].setEnabled(true);  
            }
            JButton[] arrayButtons2 = mainFrame.getChestButton();
            for (int j =0;j<mainFrame.getNbChest();j++){
                arrayButtons2[j].setEnabled(true);  
            }
            mainFrame.setActiveFight(false);              
                
        }
    }
}

    

