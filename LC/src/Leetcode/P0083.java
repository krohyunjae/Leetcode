package Leetcode;

import Structure.ListNode;

public class P0083 {
    /**
     * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode iterator = head;
        ListNode iterator2;
        while(iterator != null && iterator.next != null) {
            iterator2 = iterator.next;
            if(iterator.val == iterator2.val) {
                while(iterator2.next != null && iterator2.val == iterator2.next.val) {
                    iterator2 = iterator2.next;
                }
                iterator.next = iterator2.next;
            }
            iterator = iterator.next;
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next !=null){

            if(curr.val == curr.next.val){
                curr.next = curr.next.next;

            } else{
                curr = curr.next;
            }


        }
        return head;
    }
}
