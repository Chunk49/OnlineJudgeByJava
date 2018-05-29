package com.chunk.oj.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link TwoSum}
 */
public class TwoSumTest {
    private TwoSum instance = new TwoSum();

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{0, 1}, instance.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
