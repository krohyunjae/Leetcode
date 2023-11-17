package Structure;

import java.util.LinkedList;
import java.util.List;

public class ListNode{
    public int val;
    public ListNode next;
    public ListNode(){}
    public ListNode(int val){this.val = val;}
    public ListNode(int val, ListNode next){this.val = val; this.next = next;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode itr = this;
        if(itr == null) return null;
        while(true){
            if(itr.next == null){
                sb.append(itr.val);
                break;
            }
            sb.append(itr.val + "->");
            itr = itr.next;
        }



        return sb.toString();
    }
}