/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class HigherNumbersProblem {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        
        int result = numberHigher(array,1);
        
        // should be 2 in this case
        System.out.println(result);
    }
    
    //e.g., if we have {1,2,3}, and pass in 1, should return 2 (becuase 2 and 3 are higher than 1)
    public static int numberHigher(int[] input, int numberToCheck)
    {
        int output = 0;
        
        for (int i=0; i<input.length; i++) {
            if (input[i] > numberToCheck) {
                output++;
            }
        }
        
        return output;
    }
}
