package org.epi.bitmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class PropagateTheRightMostSetBitTest {

    @Test
    public void whenPropagateTheRightMostSetBitTestSuccess() {
        int answer = PropagateTheRightMostSetBit.propagateTheRightMostSetBit(80);
        Assert.assertEquals("The answer should be 95 not "+answer,95,
                answer);
    }
}
