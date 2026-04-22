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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        int i = 1;

        if (length == n) {
            head = head.next;
            return head;
        }

        int nthNode = length - n;

        temp = head;
        while (i < nthNode) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}