package com.chunk.oj.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link LongestPalindromicSubstringTest}
 */
public class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring instance = new LongestPalindromicSubstring();

    @Test
    public void testLongestPalindromeWithGivenPosition() {
        Assert.assertEquals(5, instance.expandAroundCenter("babab", 2, 2));
    }

    @Test
    public void testLongestPalindrome() {
        Assert.assertEquals("aba", instance.longestPalindrome("babad"));
        Assert.assertEquals("bb", instance.longestPalindrome("cbbd"));
    }
}
