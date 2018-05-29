package com.chunk.oj.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import com.chunk.oj.leetcode.util.ListNode;

/**
 * Test for {@link AddTwoNumbers}
 */
public class AddTwoNumbersTest {
    private AddTwoNumbers instance = new AddTwoNumbers();

    @Test
    public void testEqualLengthListNodes() {
        ListNode listNode = instance.addTwoNumbers(ListNode.buildListNode(new int[] {2, 4, 3}), ListNode.buildListNode(new int[] {5, 6, 4}));
        Assert.assertNotNull(listNode);
        Assert.assertEquals(7, listNode.val);
        Assert.assertEquals(0, listNode.next.val);
        Assert.assertEquals(8, listNode.next.next.val);
        Assert.assertNull(listNode.next.next.next);
    }

    @Test
    public void testEqualLengthListNodesWithCarry() {
        ListNode listNode = instance.addTwoNumbers(ListNode.buildListNode(new int[] {5}), ListNode.buildListNode(new int[] {5}));
        Assert.assertNotNull(listNode);
        Assert.assertEquals(0, listNode.val);
        Assert.assertEquals(1, listNode.next.val);
        Assert.assertNull(listNode.next.next);
    }

    @Test
    public void testUnequalLengthListNodes() {
        ListNode listNode = instance.addTwoNumbers(ListNode.buildListNode(new int[] {2, 4, 3, 1, 1}), ListNode.buildListNode(new int[] {5, 6, 4}));
        Assert.assertNotNull(listNode);
        Assert.assertEquals(7, listNode.val);
        Assert.assertEquals(0, listNode.next.val);
        Assert.assertEquals(8, listNode.next.next.val);
        Assert.assertEquals(1, listNode.next.next.next.val);
        Assert.assertEquals(1, listNode.next.next.next.next.val);
        Assert.assertNull(listNode.next.next.next.next.next);
    }

    @Test
    public void testOneNullListNodes() {
        ListNode listNode = instance.addTwoNumbers(ListNode.buildListNode(new int[] {}), ListNode.buildListNode(new int[] {5, 6, 4}));
        Assert.assertNotNull(listNode);
        Assert.assertEquals(5, listNode.val);
        Assert.assertEquals(6, listNode.next.val);
        Assert.assertEquals(4, listNode.next.next.val);
        Assert.assertNull(listNode.next.next.next);
    }
}
