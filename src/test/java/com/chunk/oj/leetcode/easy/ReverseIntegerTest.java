package com.chunk.oj.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link ReverseInteger}.
 */
public class ReverseIntegerTest {
    private ReverseInteger instance = new ReverseInteger();

    @Test
    public void test() {
        Assert.assertEquals(321, instance.reverse(123));
        Assert.assertEquals(-321, instance.reverse(-123));
        Assert.assertEquals(21, instance.reverse(120));
    }
}
