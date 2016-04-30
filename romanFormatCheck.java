import java.lang.*;
import java.io.*;
import java.util.*;

public class romanFormatCheck {
   public static int romanFormat(String romnum) throws FileNotFoundException{
      try{
         int count = 0;
         Scanner rnformat = new Scanner(new File("romanNumeralFormat.txt"));
         String romanNumeral = romnum.toUpperCase();
      
         while(rnformat.hasNextLine()){
         count++;
         String line = rnformat.nextLine(); 
            if(line.contains(romanNumeral)){
               return processRomanNumerals.romanToDecimal(romanNumeral);
            }else{
               return 0;
            }
         }
      }catch (FileNotFoundException ex){return 1;}
      return 1;
   }
}

