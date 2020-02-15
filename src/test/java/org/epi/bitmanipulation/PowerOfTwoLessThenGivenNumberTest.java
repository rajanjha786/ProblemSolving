package org.epi.bitmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfTwoLessThenGivenNumberTest {

    @Test
    public void getLargetPowerOfTwoLessThenGivenNumber() {
        Assert.assertEquals(16777216,PowerOfTwoLessThenGivenNumber.getLargestPowerOfTwoLessThenGivenNumber(21455553L));
    }

    @Test
    public void getLargetPowerOfTwoLessThenGivenNumberApproach2() {
        Assert.assertEquals(16777216,
                PowerOfTwoLessThenGivenNumber.getLargestPowerOfTwoLessThenGivenNumberApproach2(21455553L));
    }
}
