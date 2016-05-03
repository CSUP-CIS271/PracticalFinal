// temporary package name
package bin;

import java.awt.event.*;
import java.util.*;


public class Client {
    /* 
    // Singleton get implemented because no likey static methods :x
    */
    Gui gui;
    toArabic toarabic;
    ArrayList<Character> constants = new ArrayList<Character>(){{
        add('M');
        add('D');
        add('C');
        add('L');
        add('X');
        add('V');
        add('I');
    }};

    public static void main(String[] cl_args) {
        Client client = new Client();
    }

    public Client() {
        gui = new Gui();
        gui.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(500, 100);
        
        // make your action listeners.
        toarabic = new toArabic();
        
        // add your action listeners.
        gui.convertToArabic.addActionListener(toarabic);
    }
    
    class toArabic implements ActionListener {
        String inputtext;
        char[] charinput;
        char previous;
        int total = 0;
        
        /*
        Make this a thing if you have time!
        public boolean testPrevious(char input) {
            
        }
        */
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try { inputtext = gui.input.toString().toUpperCase(); }
            catch (IllegalArgumentException x) {
                gui.output.setText("Please enter either a Roman Numeral or a Number");
            }
            for (int i = 0; i < inputtext.length(); i++) {
                    if (constants.contains(inputtext.charAt(i))) {
                    charinput = inputtext.toCharArray();
                } else { gui.output.setText("Please enter a Roman Numeral");}
            }
            
            for (int i = 0; i < charinput.length; i++) {
                /* 
                // Order:
                // 1) checks to see if previous is a roman numeral
                // 2) checks to see if previous is a higher number
                // 3) minuses from total based on previous
                // 4) adds to toal based on current place in loop
                */
                if (constants.contains(previous)) {
                    switch(previous) {
                        case 'D':
                            if (charinput[i-1] == 'M') {
                                break;
                            }
                            total -= 1000;
                            previous = 'r';
                            break;
                        case 'C':
                            if (charinput[i-1] == 'D') {
                                break;
                            } 
                            total -= 500;
                            previous = 'r';
                            break;
                        case 'L':
                            if (charinput[i-1] == 'C') {
                                break;
                            }
                            total -= 50;
                            previous = 'r';
                            break;
                        case 'X':
                            if (charinput[i-1] == 'L') {
                                break;
                            }
                            total -= 10;
                            previous = 'r';
                            break;
                        case 'V':
                            if (charinput[i-1] == 'M') {
                                break;
                            }
                            total -= 5;
                            previous = 'r';
                            break;
                        case 'I':
                            if (charinput[i-1] == 'V') {
                                break;
                            }
                            total -= 1;
                            previous = 'r';
                            break;
                    }
                }
                switch(charinput[i]) {
                    case 'D':
                        total += 1000;
                        previous = 'D';
                        break;
                    case 'C':
                        total += 500;
                        previous = 'C';
                        break;
                    case 'L':
                        total += 50;
                        previous = 'L';
                        break;
                    case 'X':
                        total += 10;
                        previous = 'X';
                        break;
                    case 'V':
                        total += 5;
                        previous = 'V';
                        break;
                    case 'I':
                        total += 1;
                        previous = 'I';
                        break;
                }
            } // end of murder switches.
            
            // post the output to the gui. This is very Hamfisted.
            gui.output.setText("Arabic Number :" + total);
        } 
    } // end nested class
    
    /*
    public class toRoman implements ActionListener {
        String inputtext;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                
            }
        }
    }
    */

}
