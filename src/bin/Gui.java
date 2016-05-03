// temporary package name
package bin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Gui extends JFrame{
    JLabel label;
    JTextPane input;
    JLabel output;
    JButton convertToRoman;
    JButton convertToArabic;

   public Gui() {
       setTitle("Roman Numeral Converter");
       GridBagLayout layout = new GridBagLayout();

       setLayout(layout);
       GridBagConstraints constraints = new GridBagConstraints();

       input = new JTextPane();
       constraints.fill = GridBagConstraints.HORIZONTAL;
       constraints.gridx = 2;
       constraints.gridy = 1;
       constraints.gridwidth = 2;
       add(input, constraints);

       label = new JLabel("Number to Convert");
       constraints.weightx = 1;
       constraints.gridx = 1;
       constraints.gridy = 1;
       constraints.gridwidth = 2;
       add(label, constraints);

       output = new JLabel();
       constraints.gridx = 1;
       constraints.gridy = 2;
       constraints.gridwidth = 1;
       add(output, constraints);

       //convertToRoman = new JButton("Convert to Roman");
       //constraints.gridx = 2;
       //add(convertToRoman, constraints);

       convertToArabic = new JButton("Convert to Arabic");
       constraints.gridx = 3;
       add(convertToArabic, constraints);

    }
}
