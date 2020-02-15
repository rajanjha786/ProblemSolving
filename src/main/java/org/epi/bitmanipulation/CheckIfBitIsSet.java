package org.epi.bitmanipulation;

/**
 * Check if the ith bit is set or not
 *
 * To check this we just have to mask the ith bit and perform And Bitwise operation with given number
 * if the answer is not 0 then bit is set or else bit is not set
 */
public class CheckIfBitIsSet {

    /**
     * @param number The number on which we have to check
     * @param position The position th bit to check
     * @return boolean true if bit is set or else return false
     */
    public static boolean checkIfBitSetOrNot(int number, int position) {
        int numberBinaryLength;
        if( (numberBinaryLength = Integer.toBinaryString(number).length() - 1) < position)
            throw new IllegalArgumentException("Position value should be less then: "+numberBinaryLength);
        return (number & (1 << position)) != 0;
    }

    public static void main(String[] args) {
        System.out.println(Math.log(2));
    }
}
