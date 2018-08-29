package com.chunk.oj.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link StringToInteger}
 */
public class StringToIntegerTest {
    private StringToInteger instance = new StringToInteger();

    @Test
    public void test() {
        Assert.assertEquals(42, instance.myAtoi("42"));
        Assert.assertEquals(-42, instance.myAtoi("-42"));
        Assert.assertEquals(4193, instance.myAtoi("4193 with words"));
        Assert.assertEquals(0, instance.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648, instance.myAtoi("-91283472332"));
    }
}
