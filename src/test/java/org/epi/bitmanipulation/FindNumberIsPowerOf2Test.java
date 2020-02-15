package org.epi.bitmanipulation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FindNumberIsPowerOf2Test {

    @Test
    public void whenNumberIsPowerOfTwo() {
        assertTrue("The answer should be 0 because number is power of 2",
                FindNumberIsPowerOf2.isNumberPowerOfTwoApproach2(1024));
    }


    @Test
    public void whenNumberIsPowerOfTwoApproach2() {
        assertTrue("The answer should be 0 because number is power of 2",
                FindNumberIsPowerOf2.isNumberPowerOfTwoApproach2(1024));
    }

    @Test
    public void whenNumberIsNotPowerOfTwo() {
        assertFalse("The answer should not be zero because number is not power of 2",
                FindNumberIsPowerOf2.isNumberPowerOfTwoApproach2(63));
    }

    @Test
    public void whenNumberIsZero() {
        assertFalse("The answer should not be zero because number is 0 and it's not power of zero",
                FindNumberIsPowerOf2.isNumberPowerOfTwoApproach2(0));
    }

    @Test
    public void whenNegativeNumberPowerOf2False() {
        assertFalse("The answer should not be zero because number is negative power of 2 and it's not power of zero",
                FindNumberIsPowerOf2.isNumberPowerOfTwoApproach2(-64));
    }
}
