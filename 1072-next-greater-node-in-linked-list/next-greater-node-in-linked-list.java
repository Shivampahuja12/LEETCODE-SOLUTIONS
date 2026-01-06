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
    public int[] nextLargerNodes(ListNode head) {

        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int[] a = new int[size];
        int i = 0;
        temp = head;
        while (temp != null) {
            ListNode helper = temp.next;
            boolean flag = false;
            while (helper != null) {
                if (temp.val < helper.val) {
                    a[i++] = helper.val;
                    flag = true;
                    break;
                }
                helper = helper.next;
            }
            if (!flag) a[i++] = 0;
            temp = temp.next;
        }

        return a;
    }
}