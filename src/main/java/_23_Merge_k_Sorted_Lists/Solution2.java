package _23_Merge_k_Sorted_Lists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solutio2 {
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeKLists(ListNode[] lists, int start, int end){
        if (start > end) return null;
        if (start == end) return lists[start];
        int mid = (start + end) / 2;
        ListNode left = mergeKLists(lists, start, mid);
        ListNode right = mergeKLists(lists, mid + 1, end);
        return merge2Lists(left, right);
    }

    private ListNode merge2Lists(ListNode n1, ListNode n2){
        if (n1 == null) return n2;
        if (n2 == null) return n1;
        if (n1 == n2) return n1;
        ListNode head = new ListNode(0);
        ListNode current = head;
        while(n1 != null && n2 != null){
            if (n1.val < n2.val){
                current.next = n1;
                current = current.next;
                n1 = n1.next;
            } else {
                current.next = n2;
                current = current.next;
                n2 = n2.next;
            }
        }
        if (n1 == null) current.next = n2;
        else current.next = n1;
        return head.next;
    }
}



