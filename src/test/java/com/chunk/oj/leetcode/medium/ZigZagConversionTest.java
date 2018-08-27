package com.chunk.oj.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link ZigZagConversion}
 */
public class ZigZagConversionTest {
    private ZigZagConversion instance = new ZigZagConversion();

    @Test
    public void test() {
        Assert.assertEquals("PAHNAPLSIIGYIR", instance.convert("PAYPALISHIRING", 3));
        Assert.assertEquals("PINALSIGYAHRPI", instance.convert("PAYPALISHIRING", 4));
    }
}
