package leetCode;



public class P0019 {
    int counter = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        helper(head, n, counter);
        return head;
        // if(head.equals(null)) return head;

        // if(n == head.val){
        //     return head.next;
        // }
        // head.next = removeNthFromEnd(head, n);
        
    }

    private ListNode helper(ListNode head, int n, int counter){
        if(n == 1){
            return head.next;
        } else if (head == null){
            return head;
        }
        head.next = helper(head.next, n, counter);
        counter++;
        if(counter == n){
            head.next = head.next.next;
            return head.next;
        }
        return head;
    }

    
}
