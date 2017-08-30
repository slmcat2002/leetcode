package _61_Rotate_List;

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int length = 1;
        ListNode tail = head;
        while(tail.next != null){
            length ++;
            tail = tail.next;
        }
        k = k % length;
        if (k == 0) return head;
        tail.next = head;
        ListNode split = head;
        int count = 0;
        while(count < length - k - 1){
            split = split.next;
            count ++;
        }
        head = split.next;
        split.next = null;
        return head;
    }

}
