package org.epi.bitmanipulation;

/**
 * The problem here is to find the number of bit set to 1 in an Integer
 *
 * Java represents the negative number in 2's complement form where MSB is set to 1
 *
 * when (x-1) is represented as binary then all the bit will be same as x except for the rightmost 1 (it will be 0) and
 * all the bits after that will be set to 1
 * 4 = 100
 * then 3 = 011
 * Approach1 compute x = x / 2 until x%2 is 0 after that if x == 1 return true else return false TC O(log n) SC O(1)
 * Approach2 If x & (x-1) is zero then the number x is the power of 2 or else it is not of power 2 TC O(1) SC O(1)
  */
public class FindNumberIsPowerOf2 {

    public static boolean isNumberPowerOfTwoApproach1(int x) {
        if( x  == 0)
            return false;
        else {
            while(x % 2 == 0){
                x = x/2;
            }
            return (x == 1);
        }
    }
   public static boolean isNumberPowerOfTwoApproach2(int x) {
       // x & is to handle the corner case when x is equal to 0
       if( x == 0)
           return false;
       else return 0 == (x & (x - 1));
   }

}
