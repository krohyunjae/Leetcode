package Structure;

import java.util.List;

public class SingularLinkedList {
    public ListNode head;
    public ListNode last;
    public SingularLinkedList(int[] arr){
        if(arr.length < 1) return;
        ListNode head = new ListNode();
        for (int i = 1; i < arr.length; i++) {
            add(arr[i]);
        }
    }
    public SingularLinkedList(List<Integer> list) {

    }

    public ListNode add(int val) {
        if(head == null) {
            head = new ListNode(val);
            last = head;
            return head;
        }
        ListNode iterator = head;
        while(iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = new ListNode(val);
        last = iterator.next;
        return head;
    }

    public ListNode add(ListNode node) {
        if(head == null) {
            head = node;
            return head;
        }
        ListNode iterator = head;
        while(iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = node;
        return head;
    }

    public void remove(int val) {
        if(head == null) return;
        if(head.val == val) {head = head.next; return;}

        ListNode prev = new ListNode(Integer.MIN_VALUE, head);
        ListNode iterator = head;
        while(iterator.next != null) {
            if(iterator.val == val) {
                prev.next = iterator.next;
                break;
            }
            iterator = iterator.next;
            prev = prev.next;
        }
    }



}
