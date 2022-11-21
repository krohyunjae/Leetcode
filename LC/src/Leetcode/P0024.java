package Leetcode;

import Structure.ListNode;

public class P0024 {
    /**
     * Given a linked list, swap every two adjacent nodes and return its head.
     * You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
     * Input: head = [1,2,3,4]
     * Output: [2,1,4,3]
     */
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode headNextNext = head.next.next;
        ListNode headNext = head.next;
        ListNode currHead = head;
        head = headNext;
        head.next = currHead;
        head.next.next = swapPairs(headNextNext);
        return head;
    }

}
