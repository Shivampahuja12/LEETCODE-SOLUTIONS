/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        if (length == 1){
            return head.next;
        }
        int idx = (length / 2) - 1;
        temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}