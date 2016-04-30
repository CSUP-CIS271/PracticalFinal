/*Author:	Daniel Baliczek
Date: 4/29
File: RomanNumConverter.java
desc: Converts Arabic to Roman. Syntax Check is in the gui.
*/
public class RomanNumConverter {
	//Reference arrays, no casting will be necessary
	private static final char[] romanRef = new char[]{'I','V','X','L','C','D','M'};
	private static final int[] arabicRef = new int[]{1,5,10,50,100,500,1000};
	RomanNumConverter(){
	}
	//This will return an array that will store each character of the user input
	public static int con(String input){
		return convert(toArabic(populate(input)));
	}
	private static char[] populate(String roman){
		roman = roman.toUpperCase();
		char[] input= roman.toCharArray();
		return input;
	}
	//This will return an array that will convert each of the user's inputs into arabic format
	private static int[] toArabic(char[] input){
		int[] arabic = new int[input.length];
		for(int i=0; i<input.length;i++){
			boolean check = false;
			int j = 0;
			while(check != true){
				if(input[i] == romanRef[j]){
					arabic[i]= arabicRef[j];
					check = true;
				}
				else{
					j++;
				}
			}
		}
		return arabic;
	}
	//This will initialize add and subtract, and return the output
	private static int convert(int[] arabic){
		int add = arabic[arabic.length-1];//the last index of the array is always added
		int subtract = 0; // Not all roman numerals have something to subtract
		
		for(int i = 0; i<arabic.length-1;i++){//last index already added
			if(arabic[i]>=arabic[i+1])
				add+=arabic[i];
			else
				subtract+=arabic[i];
		}
		return (add-subtract);
	}
}