package _23_Merge_k_Sorted_Lists;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode n1, ListNode n2){
                return Integer.compare(n1.val, n2.val);
            }
        });
        for (ListNode n : lists){
            if (n != null) pq.add(n);
        }
        ListNode head = new ListNode(0);
        ListNode current = head;
        while(pq.size() > 0){
            ListNode node = pq.poll();
            current.next = node;
            current = node;
            if (node.next != null){
                pq.add(node.next);
            }
        }
        return head.next;
    }
}