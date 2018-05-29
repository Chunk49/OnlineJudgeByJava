package com.chunk.oj.leetcode.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link ListNode}
 */
public class ListNodeTest {
    @Test
    public void testNull() {
        Assert.assertNull(ListNode.buildListNode(new int[] {}));
    }

    @Test
    public void testNormalArray() {
        ListNode listNode = ListNode.buildListNode(new int[] {2, 4, 3});
        Assert.assertEquals(2, listNode.val);
        Assert.assertEquals(4, listNode.next.val);
        Assert.assertEquals(3, listNode.next.next.val);
        Assert.assertNull(listNode.next.next.next);
    }
}
