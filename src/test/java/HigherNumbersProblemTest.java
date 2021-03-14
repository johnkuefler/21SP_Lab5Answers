/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author johnk
 */
public class HigherNumbersProblemTest {

    public HigherNumbersProblemTest() {
    }

    @Test
    public void testNumberHigher() {
        System.out.println("numberHigher");
        int[] input = {1, 2, 3, 4, 5};
        int numberToCheck = 2;
        int expResult = 3;
        int result = HigherNumbersProblem.numberHigher(input, numberToCheck);
        assertEquals(expResult, result);
    }

    @Test
    public void testNumberHigher2() {
        System.out.println("numberHigher");
        int[] input = {1, 2, 3, 4, 5};
        int numberToCheck = 6;
        int expResult = 0;
        int result = HigherNumbersProblem.numberHigher(input, numberToCheck);
        assertEquals(expResult, result);
    }

}
