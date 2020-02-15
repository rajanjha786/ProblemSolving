package org.epi.bitmanipulation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindNumberOfBitSetTest {

    @Test
    public void wheNumberOfBitIsGivenCorrectPassApproach1() {
        assertEquals("Answer should be 15",
                13, FindNumberOfBitSet.getNumberOfBitSetApproach1(889988773));
    }

    @Test
    public void wheNumberOfBitIsGivenCorrectPassApproach2() {
        assertEquals("Answer should be 15",
                13, FindNumberOfBitSet.getNumberOfBitSetApproach2(889988773));
    }
}
