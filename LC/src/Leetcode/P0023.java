package Leetcode;

import Structure.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 *  Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 */
public class P0023 {

    public ListNode mergeKLists(ListNode[] lists) {
        int min, idx;
        boolean shouldBreak;
        ListNode head = new ListNode(0);
        ListNode h = head;
        while(true){
            shouldBreak = true;
            min = Integer.MAX_VALUE;
            idx = 0;
            for (int i = 0; i < lists.length; i++) {
                ListNode curr = lists[i];
                if(curr != null){
                    if(min > curr.val){
                        idx = i;
                        min = curr.val;
                    }
                    shouldBreak = false;
                }
            }
            if(shouldBreak) break;
            ListNode a = new ListNode(min);
            ListNode temp = h;
            h = a;
            temp.next = h;
            lists[idx] = lists[idx].next;
        }
        return head.next;
    }

    public ListNode mergeKListsPQ(ListNode[] lists){
        Queue<ListNode> pq = new PriorityQueue<ListNode>((a,b) -> a.val - b.val);
        for(ListNode node: lists){
            if(node != null)
                pq.add(node);
        }
        ListNode head = new ListNode(0);
        ListNode itr = head;
        while(!pq.isEmpty()){
            itr.next = pq.poll();
            itr = itr.next;
            ListNode next = itr.next;
            if(next != null){
                pq.add(next);
            }
        }
        return head.next;
    }
    // Divide and Conquer
    public ListNode mergeKListsDC(ListNode[] lists){
        if(lists.length == 0) return null;
        int interval = 1;
        while(interval<lists.length){
            for(int i = 0; i + interval < lists.length; i = i+interval*2){
                lists[i] = mergeTwoLists(lists[i], lists[i+interval]);
            }
            interval *= 2;
        }
        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode n1, ListNode n2){
        ListNode h = new ListNode(0);
        ListNode result = h;
        while(n1 != null && n2 != null){
            if(n1.val < n2.val){
                h.next = n1;
                n1 = n1.next;
            }else{
                h.next = n2;
                n2 = n2.next;
            }
            h = h.next;
        }
        if(n1 == null){
            h.next = n2;
        }
        if(n2 == null){
            h.next = n1;
        }
        return result.next;
    }



    private ListNode mergeKLists(ListNode[] lists, int start, int end){
        if(start == end){
            return lists[start];
        }
        int mid = start + (end - start) /2;
        ListNode left = mergeKLists(lists, start, mid);
        ListNode right = mergeKLists(lists, mid+1, end);
        return mergeTwoLists(left, right);

    }






}
