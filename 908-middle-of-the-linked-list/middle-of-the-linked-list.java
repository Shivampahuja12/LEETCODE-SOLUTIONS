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
    public ListNode middleNode(ListNode head) {

        if (head.next == null){
            return head;
        }

        ListNode temp = head;
        int count = 0;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        
        int i = 1;
        temp = head;
        while (i < (count/2) + 1){
            temp = temp.next;
            i++;
        }

        ListNode newHead = temp;
        return newHead;
    }
}