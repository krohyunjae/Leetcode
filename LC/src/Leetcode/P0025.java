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
        int count = 0;
        ListNode ans = new ListNode(0,head);
        ListNode h = head;
//        ListNode tail;
        while(head!= null){
            head = head.next;
            count++;
            if(count == k){
                count = 0;
                ListNode temp = head.next;
                //cut the link
                head.next = null;
                reverse(h).next = temp;
                head = temp;
                h = temp;
            }
        }
        return ans.next;
    }

    /**
     *
     * @param head
     * @return End of the list node
     */
    private ListNode reverseListNode(ListNode head){
        if(head == null || head.next == null){
            return head;

        }
        ListNode temp = reverseListNode(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    private ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;

        }
        reverseListNode(head.next);
        head.next.next = head;
        head.next = null;
        return head;
    }

}
