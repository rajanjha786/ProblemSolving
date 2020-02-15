package org.epi.bitmanipulation;

/**
 * First approach is to mask the ith bit of number and perform And Operation
 * if answer is 0 then bit is not set or else bit is set TimeComplexity O(n)
 * where n is the length of binary string of number Space Complexity O(1)
 *
 * Second Approach is to find x & (x - 1) it converts the rightmost bit which is set to 1 in x to 0
 * and repeat the same process until x is greater then 0 The Time Complexity of this approach is O(s)
 * where s is the number of bit set in x and space complexity is O(1)
 */
public class FindNumberOfBitSet {

    public static int getNumberOfBitSetApproach1(int x) {

        if(x == 0)
            return 0;

        int binaryLength = Integer.toBinaryString(x).length();
        int count = 0;
        for(int i = 0; i < binaryLength; i++) {
            if((x & (1<<i)) != 0)
                count++;
        }
        return count;
    }

    public static int getNumberOfBitSetApproach2(int x) {

        int count = 0;
        while( x > 0) {
            x = x & (x -1);
            count++;
        }

        return count;
    }
}
