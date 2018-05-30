package com.chunk.oj.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link LongestSubstringWithoutRepeatingCharacters}
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters instance = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void test() {
        Assert.assertEquals(3, instance.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, instance.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, instance.lengthOfLongestSubstring("pwwkew"));

        Assert.assertEquals(1, instance.lengthOfLongestSubstring("b"));
        Assert.assertEquals(2, instance.lengthOfLongestSubstring("au"));
        Assert.assertEquals(2, instance.lengthOfLongestSubstring("aab"));
    }
}
