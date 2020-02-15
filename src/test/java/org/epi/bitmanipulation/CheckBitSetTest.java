package org.epi.bitmanipulation;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CheckBitSetTest {

    @Test
    public void whenBitIsSetThenTrue() {
        assertTrue("Bit is Set Answer should be true",
                CheckIfBitIsSet.checkIfBitSetOrNot(20,2));
    }

    @Test
    public void whenBitIsNotSetThenFalse() {
        assertFalse("Bit is Set Answer should be false",
                CheckIfBitIsSet.checkIfBitSetOrNot(20,3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPositionIsOutOfBoundThenException() {
        CheckIfBitIsSet.checkIfBitSetOrNot(20,5);
    }
}
