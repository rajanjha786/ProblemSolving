package org.epi.bitmanipulation;

/**
 * Approach1 : Check every power from 2^0 until it becomes greater then the given number;
 *
 * Approach 2: calculate p = (long) log 2 N/log 2 and then calculate 2 ^ p
 *
 * Application of this problem is suppose you have given a queue of Length N and you have to select person
 * only with even position and then again continue doing it until only one person left
 *
 * 1 2 3 4 5 6 7 8 9 10  ===>Given queue
 *     2 4 6 8 10
 *        4 8
 *         8
 */
public class PowerOfTwoLessThenGivenNumber {

    public static long getLargestPowerOfTwoLessThenGivenNumber(long number) {

        long curr;
        long res = 0;
        for(int i = 0; i < 8 * Long.BYTES; i++){
            curr = 1 << i;
            if(curr > number)
                break;
            res = curr;
        }

        return res;
    }

    public static long getLargestPowerOfTwoLessThenGivenNumberApproach2(long number) {

        long pow = (long) (Math.log(number) / Math.log(2));
        return (long) Math.pow(2,pow);
    }
}
