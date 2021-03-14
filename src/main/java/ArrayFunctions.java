/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class ArrayFunctions {

    public static void main(String[] args) {
        double[] testArray = {1, 2, 3, 4, 5};

        // should be 15
        System.out.println("Total is: " + getTotal(testArray));
        // should be 3
        System.out.println("Average is: " + getAverage(testArray));
        // should be 5
        System.out.println("Highest is: " + getHighest(testArray));
        // should be 1
        System.out.println("Lowest is: " + getLowest(testArray));
    }

    public static double getTotal(double[] input) {
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total += input[i];
        }
        return total;
    }

    public static double getAverage(double[] input) {
        // note that we can just call getTotal here to avoid having to define how to sum up the aray again here
        return getTotal(input) / input.length;
    }

    public static double getHighest(double[] input) {
        double highest = input[0];

        for (int i = 0; i < input.length; i++) {
            if (input[i] > highest) {
                highest = input[i];
            }
        }

        return highest;
    }

    public static double getLowest(double[] input) {
        double lowest = input[0];

        for (int i = 0; i < input.length; i++) {
            if (input[i] < lowest) {
                lowest = input[i];
            }
        }

        return lowest;
    }
}
