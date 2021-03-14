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
public class ArrayFunctionsTest {

    public ArrayFunctionsTest() {
    }

    @org.junit.jupiter.api.Test
    public void testGetTotal() {
        System.out.println("getTotal");
        double[] input = {1, 2, 3, 4, 5};
        double expResult = 15;
        double result = ArrayFunctions.getTotal(input);
        assertEquals(expResult, result, 0.0);
    }

    @org.junit.jupiter.api.Test
    public void testGetAverage() {
        System.out.println("getAverage");
        double[] input = {1, 2, 3, 4, 5};
        double expResult = 3;
        double result = ArrayFunctions.getAverage(input);
        assertEquals(expResult, result, 0.0);
    }

    @org.junit.jupiter.api.Test
    public void testGetHighest() {
        System.out.println("getHighest");
        double[] input = {1,2,3,4,5};
        double expResult = 5;
        double result = ArrayFunctions.getHighest(input);
        assertEquals(expResult, result, 0.0);
    }

    @org.junit.jupiter.api.Test
    public void testGetLowest() {
        System.out.println("getLowest");
        double[] input = {1,2,3,4,5};
        double expResult = 1;
        double result = ArrayFunctions.getLowest(input);
        assertEquals(expResult, result, 0.0);
    }

}
