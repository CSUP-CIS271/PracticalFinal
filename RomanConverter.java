/* Jared Horvat
   Cis 271
   Java Final Program
   Roman to Arabic */

import java.util.*;

public class RomanConverter {

    public int checkRoman(int TotalDecimal, int LastRomanLetter, int LastDecimal) {
        if (LastRomanLetter > TotalDecimal) {
            return LastDecimal - TotalDecimal;
        } 
        else {
            return LastDecimal + TotalDecimal;
        }
    }

    public void romanToDecimal(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = checkRoman(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = checkRoman(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = checkRoman(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;
                       case 'L':
                    decimal = checkRoman(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = checkRoman(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = checkRoman(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = checkRoman(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        System.out.println(romanNumeral + " is equal to " + decimal);
    }

    public void callRoman() {
        Scanner getRoman = new Scanner(System.in);
        String Roman = getRoman.next();
        switch (Roman) {
            default:
                romanToDecimal(Roman);
                callRoman();
                        case "End":
                break;

        }
    }

    public static void main(String[] args) {
        romanToDecimal rtd = new romanToDecimal();
        System.out.println("Enter roman number you want to convert \nCommand End to stop entering ");
        rtd.callRoman();

    }
}