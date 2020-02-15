package org.epi.bitmanipulation;

/**
 * The question is to Propagate the rightmost set bit
 * For ex: x = 01010000 to 01011111
 * Solution = x | (x - 1)
 * TC O(1) SC O(1)
 */
public class PropagateTheRightMostSetBit {

    public static int propagateTheRightMostSetBit(int x) {

        return x | (x -1);
    }
}
