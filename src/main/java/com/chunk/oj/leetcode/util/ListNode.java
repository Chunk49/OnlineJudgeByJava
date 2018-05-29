package com.chunk.oj.leetcode.util;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode buildListNode(int[] array) {
        ListNode result = null;
        for (int i = array.length - 1; i >= 0; i--) {
            if (result == null) {
                result = new ListNode(array[i]);
            } else {
                ListNode current = new ListNode(array[i]);
                current.next = result;
                result = current;
            }
        }
        return result;
    }
}
