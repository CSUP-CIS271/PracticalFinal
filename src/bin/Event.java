package bin;

import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Event implements ActionListener {
    JTextField inputtext;
    char[] charinput;
    int intinput;
    ArrayList<Character> constants = new ArrayList<Character>(){{
        add('M');
        add('D');
        add('C');
        add('L');
        add('X');
        add('V');
        add('I');
    }};
 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton temp = (JButton)e.getSource();
        if (temp.getName().equals("Convert to Roman")) {
            
        }
    }
    
    public String setInput(JTextField inputtext){
        /* 
        // Gets the input ffrom a JTextField
        // This needs to happen before Buttons go do their thing.
        // TO DO: ADD THIS TO CLIENT.JAVA
        */
        
        // assign arguments to class scope
        this.inputtext = inputtext; 
        
        // set temp String
        String temp = inputtext.toString().toUpperCase(); 
        
        // check to see if temp contains a character
        if (constants.contains(temp.charAt(0))) {
            charinput = temp.toCharArray();
            toArabic();
        
        // or if it contains an Integer. Try Catch included.
        // if Error is caught, passes it as a string back up to (hopefully)
        // a label
        } else if ((int)temp.charAt(0) > 0) {
            try { intinput = Integer.parseInt(temp); toRoman(intinput);}
            catch (NumberFormatException e) {
                return String.valueOf(e);
            }
        } else { return "Please input either a Roman Numeral, or an Integer";}
    }

    private void toArabic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void toRoman(int intinput) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
