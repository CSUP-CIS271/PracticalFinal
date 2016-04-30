import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class RomanGUI extends JFrame{
   private JLabel decimalLabel;
   private JButton button;
   private JTextField textfield;
  
   public RomanGUI() {
      setLayout(new FlowLayout());
            
      textfield = new JTextField(16);
      add(textfield);
      
      button = new JButton("Convert");
      add(button);
            
      decimalLabel = new JLabel("");
      add(decimalLabel);
      
      event e = new event();
      button.addActionListener(e);
   }
   
   public class event implements ActionListener {
      public void actionPerformed(ActionEvent e){
         String romnum = null;
         int decimal;
         try{
            while(romnum == null){
            
               romnum = textfield.getText();
            
               decimal = romanFormatCheck.romanFormat(romnum);
               if(decimal == 0){
                 decimalLabel.setText("Incorrect Format!");
               }
               else
               {
                 decimalLabel.setText("Decimal: " +decimal);
               }
            }
         }catch(Exception ex){decimalLabel.setText("Error: " + ex);}
      }
   }
   
   public static void main(String[] args){
      RomanGUI gui = new RomanGUI();
      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gui.setTitle("Roman Converter");
      gui.setVisible(true);
      gui.setSize(500, 150);
        
   }      
}