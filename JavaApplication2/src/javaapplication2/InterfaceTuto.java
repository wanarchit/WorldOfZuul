package javaapplication2;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

///////////////////////////////////////////////////////////////

public class InterfaceTuto extends JFrame{
    

   //////////////////
   private JPanel globalPanel, myPanel;
  
    //////////////////
   private final JLabel label;

   ///////////////////

   

   
///////////////////////////////////////////////////////////////
   
   public InterfaceTuto (){
       

       //-----------------------------------------------------------------------
       
       //1er label de la frame 
       label = new JLabel ("",JLabel.CENTER);
       label.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,35));
       label.setForeground(Color.red);
       label.setOpaque(false);
       /////////////////////
        
        myPanel = new JPanel();
        myPanel.setOpaque(false);
        
      

        
        
       ///////////////////
       //Panel global
       globalPanel = new JPanel();
       globalPanel.setLayout(new GridLayout(5,1));
       globalPanel.add(label);
       globalPanel.setOpaque(false);
       ///////////////////
       
     
       //Action definition for every buttons
    
       
       Container c = new JLabel(makeImage());
       c.setLayout(new FlowLayout());
       c.add(globalPanel);
       c.setPreferredSize(new Dimension(800,800));
       c.setMaximumSize(new Dimension(800,800));
       c.setMinimumSize(new Dimension(800,800));
       this.add(c);
       
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setUndecorated(true);
       this.setResizable(false);
       this.setPreferredSize(new Dimension(800,800));
       this.setMaximumSize(new Dimension(800,800));
       this.setMinimumSize(new Dimension(800,800));
       this.setLocationRelativeTo(null);
       this.setVisible(true);
   }
   
   
   private ImageIcon makeImage(){
       BufferedImage image= null;
        try {
        image = ImageIO.read(new File("images/tuto5.PNG"));
        }catch (IOException e){
        }
       Graphics g = image.getGraphics();

       return new ImageIcon(image);      
   }
   


}
   

        
        