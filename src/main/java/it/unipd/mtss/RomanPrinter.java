////////////////////////////////////////////////////////////////////
// MATTEO BELLATO 2172263
// STEFANO ANDREAS MARIAN GHETU 2103473
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {
    public static void main(String[] args) {
        for (int i = 0; i < 1001; i++) {
            System.out.println(print(i));
        }
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        HashMap<String, String[]> conversionTable = new HashMap<>();

        conversionTable.put("I", new String[] {
                "  _____  ",
                " |_   _| ",
                "   | |   ",
                "   | |   ",
                "  _| |_  ",
                " |_____| "
        });

        conversionTable.put("V", new String[] {
                " __      __ ",
                " \\ \\    / / ",
                "  \\ \\  / /  ",
                "   \\ \\/ /   ",
                "    \\  /    ",
                "     \\/     "
        });

        conversionTable.put("X", new String[] {
                "__   __",
                "\\ \\ / /",
                " \\ V / ",
                "  > <  ",
                " / . \\ ",
                "/_/ \\_\\"
        });

        conversionTable.put("L", new String[] {
                "  _       ",
                " | |      ",
                " | |      ",
                " | |      ",
                " | |____  ",
                " |______| "
        });

        conversionTable.put("C", new String[] {
                "   _____  ",
                "  / ____| ",
                " | |      ",
                " | |      ",
                " | |____  ",
                "  \\_____| "
        });

        conversionTable.put("D", new String[] {
                "  _____   ",
                " |  __ \\  ",
                " | |  | | ",
                " | |  | | ",
                " | |__| | ",
                " |_____/  "
        });

        conversionTable.put("M", new String[] {
                "  __  __  ",
                " |  \\/  | ",
                " | \\  / | ",
                " | |\\/| | ",
                " | |  | | ",
                " |_|  |_| "
        });

        StringBuilder romanNumberAsciiArt = new StringBuilder();
        int totalLines = 6;

        for (int i = 0; i < totalLines; i++) {
            for (String ch : romanNumber.split("")) {
                String[] lines = conversionTable.get(ch);
                if (lines != null) {
                    romanNumberAsciiArt.append(lines[i]);
                }
            }
            romanNumberAsciiArt.append("\n");
        }

        return romanNumberAsciiArt.toString();
    }
}

