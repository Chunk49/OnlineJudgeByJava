package com.chunk.oj.leetcode.hard;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link MedianOfTwoSortedArrays}
 */
public class MedianOfTwoSortedArraysTest {
    private MedianOfTwoSortedArrays instance = new MedianOfTwoSortedArrays();

    @Test
    public void test() {
        Assert.assertEquals(2.0, instance.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.01);
        Assert.assertEquals(2.5, instance.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.01);
    }
}
