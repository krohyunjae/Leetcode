/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
class ListNode {

    int val;
    ListNode next;
    ListNode() {

    }
    ListNode(int val) {
        this.val = val; 
    }
    ListNode(int val, ListNode next){
        this.val = val; this.next = next;
    }

}
public class P0019 {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(Integer.MAX_VALUE);
        start.next = head;
        ListNode fast = start, slow = start;
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
