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
    public boolean isPalindrome(ListNode head) {

        if(head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        

        ListNode secondList = slow;
        ListNode prev = null;

        while (secondList != null){
            ListNode temp = secondList.next;
            secondList.next = prev;
            prev = secondList;
            secondList = temp;
        }
        
        // prev = head;

        ListNode first = head;
        secondList = prev;

        while (secondList != null){
            if (first.val != secondList.val){
                return false;
            }
            first = first.next;
            secondList = secondList.next;
        }

        return true;
    }
}