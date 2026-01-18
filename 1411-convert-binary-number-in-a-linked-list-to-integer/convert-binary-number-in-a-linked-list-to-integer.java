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
    public int getDecimalValue(ListNode head) {

        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while (temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }
        
        int result = 0;
        int two = 0;
        for (int i=sb.length()-1; i>=0; i--){
            char ch = sb.charAt(i);
            int val = ch - 48;
            result = result + val * (int)Math.pow(2, two);
            two++;
        }
        return result;
        
    }
}