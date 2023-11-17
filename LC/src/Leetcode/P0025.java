package Leetcode;

import Structure.ListNode;

public class P0025 {
    /**
     * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
     *
     * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
     *
     * You may not alter the values in the list's nodes, only nodes themselves may be changed.
     *
     * Input: head = [1,2,3,4,5], k = 2
     * Output: [2,1,4,3,5]
     *
     * Input: head = [1,2,3,4,5], k = 3
     * Output: [3,2,1,4,5]
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        int count = 1;
        ListNode iterator = head;
        ListNode prev = new ListNode(Integer.MIN_VALUE, head);
        ListNode pp = prev;
        while(iterator.next != null){
            ListNode localHead = iterator;

            while(count < k && iterator.next != null) {
                iterator = iterator.next;
                count++;
            }
            if(count < k) break; // Reached the last group but there are less than k nodes

            ListNode temp = iterator.next; // next node
            iterator.next = null;
            if(prev.next == head) {
                head = reverse(localHead);
                prev.next = head;

            } else {
                prev.next = reverse(localHead);
            }
            localHead.next = temp;
            iterator = temp;
            // Now that the group is reversed, localHead is pointing at the end of the group
            prev = localHead;
            count = 1;
        }
        return pp.next;
    }

    /**
     *
     * @param head
     * @return End of the list node
     */
    private ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

//    private ListNode reverse(ListNode head){
//        if(head == null || head.next == null){
//            before.next = head;
//            return head;
//
//        }
//        reverseListNode(head.next);
//        head.next.next = head;
//        head.next = null;
//        return head;
//    }

}
