////////////////////////////////////////////////////////////////////
// MATTEO BELLATO 2172263
// STEFANO ANDREAS MARIAN GHETU 2103473
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.NavigableMap;
import java.util.TreeMap;


public class IntegerToRoman {
    private static final Integer MAX_ALLOWED_NUMBER = 1000;
    public static String convert(int number) {
        NavigableMap<Integer, String> conversionTable = new TreeMap<>();
        conversionTable.put(1, "I");
        conversionTable.put(4, "IV");
        conversionTable.put(5, "V");
        conversionTable.put(9, "IX");
        conversionTable.put(10, "X");
        conversionTable.put(40, "XL");
        conversionTable.put(50, "L");
        conversionTable.put(90, "XC");
        conversionTable.put(100, "C");
        conversionTable.put(400, "CD");
        conversionTable.put(500, "D");
        conversionTable.put(900, "CM");
        conversionTable.put(1000, "M");

        String romanNumber = "";

        if(number > MAX_ALLOWED_NUMBER){
            throw new IllegalArgumentException("Il numero arabo fornito è maggiore di"+ 
            MAX_ALLOWED_NUMBER+ ": " + number + ">" + MAX_ALLOWED_NUMBER);
        }

        if(number < 0){
            throw new IllegalArgumentException("Il numero arabo fornito è negativo.");
        }

        while (number > 0) {
            int key = conversionTable.floorKey(number);
            romanNumber += conversionTable.get(key);
            number -= key;
        }

        return romanNumber;
    }
}
