////////////////////////////////////////////////////////////////////
// MATTEO BELLATO 2172263
// STEFANO ANDREAS MARIAN GHETU 2103473
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class RomanPrinterTest 
{
    @Test
    public void printingSingleDigitsTest() {
        // Arrange
        HashMap<Integer, String> expectedResults = new HashMap<>();
        expectedResults.put(1, "  _____  \n" +
                " |_   _| \n" +
                "   | |   \n" +
                "   | |   \n" +
                "  _| |_  \n" +
                " |_____| \n");

        expectedResults.put(5, " __      __ \n" +
                " \\ \\    / / \n" +
                "  \\ \\  / /  \n" +
                "   \\ \\/ /   \n" +
                "    \\  /    \n" +
                "     \\/     \n");

        expectedResults.put(10,
                "__   __\n" +
                        "\\ \\ / /\n" +
                        " \\ V / \n" +
                        "  > <  \n" +
                        " / . \\ \n" +
                        "/_/ \\_\\\n");

        expectedResults.put(50,
                "  _       \n" +
                        " | |      \n" +
                        " | |      \n" +
                        " | |      \n" +
                        " | |____  \n" +
                        " |______| \n");

        expectedResults.put(100,

                "   _____  \n" +
                        "  / ____| \n" +
                        " | |      \n" +
                        " | |      \n" +
                        " | |____  \n" +
                        "  \\_____| \n");

        expectedResults.put(500,
                "  _____   \n" +
                        " |  __ \\  \n" +
                        " | |  | | \n" +
                        " | |  | | \n" +
                        " | |__| | \n" +
                        " |_____/  \n");

        expectedResults.put(1000,
                "  __  __  \n" +
                        " |  \\/  | \n" +
                        " | \\  / | \n" +
                        " | |\\/| | \n" +
                        " | |  | | \n" +
                        " |_|  |_| \n");

        Integer[] digitsToCheck = expectedResults.keySet()
                .stream()
                .sorted()
                .toArray(Integer[]::new);

        HashMap<Integer, String> results = new HashMap<>();

        // Act
        for (Integer digit : digitsToCheck) {
            results.put(digit, RomanPrinter.print(digit));
        }

        // Assert
        for (Integer digit : digitsToCheck) {
            assertEquals(results.get(digit), expectedResults.get(digit));
        }
    }
}
