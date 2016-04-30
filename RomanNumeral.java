import java.util.*;

public class RomanNumeral {
	public static void main (String [] args){
	choices();
	}
	
	public static void choices(){
	    Scanner roman = new Scanner(System.in);
		
		System.out.println("Please enter Roman Numeral to convert");
		String r = roman.nextLine();
		r = r.toUpperCase();
		
		 roman.close();
		 try{
			 if (r.length() == 0){
				 System.out.println("Input not valid");
             
          int i=0;
          int arabic =0;
          
          while (i<r.length()){
          
          char letter = r.charAt(i);
          int number = convert(letter);
          i++;
          
          if (i == r.length()) {
          arabic += number;
          }
            else {
               arabic+= number;
          }
				 
			 }
          }
		 }//end try
		 catch (NumberFormatException ex){
		        System.out.println("Enter valid Roman Numeral");
		 } 
		 
		}//end catch
		 static int convert(char letter) {
			 switch (letter) {
			 case 'I': 
				 return 1;
			case 'V': 
				 return 5;
			 case 'X': 
				 return 10;
			 case 'L': 
				 return 50;
			 case 'C': 
				 return 100;
			 case 'D': 
				 return 500;
			 case 'M': 
				 return 1000;
			 default: throw new NumberFormatException(
			 "Illegal character \"" + letter + "\" in Roman numeral");
			 }//end switch
		 	 
	}
		 
}


