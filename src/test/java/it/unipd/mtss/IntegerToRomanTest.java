////////////////////////////////////////////////////////////////////
// MATTEO BELLATO 2172263
// STEFANO ANDREAS MARIAN GHETU 2103473
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class IntegerToRomanTest {
    /**
     * Testing the correct conversion of the trickiest arab numbers into roman
     */
    @Test
    public void convertArabToRomanTest() {
        // Arrange
        HashMap<Integer, String> expectedResults = new HashMap<>();
        expectedResults.put(0, "");
        expectedResults.put(3, "III");
        expectedResults.put(4, "IV");
        expectedResults.put(9, "IX");
        expectedResults.put(49, "XLIX");
        expectedResults.put(99, "XCIX");
        expectedResults.put(499, "CDXCIX");
        expectedResults.put(999, "CMXCIX");
        expectedResults.put(1000, "M");

        HashMap<Integer, String> results = new HashMap<>();

        // Act
        expectedResults.forEach((k, v) -> {
            results.put(k, IntegerToRoman.convert(k));
        });

        // Assert
        assertEquals(results, expectedResults);
    }

}

