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
    public ListNode insertionSortList(ListNode head) {

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // System.out.println(size);
        int[] a = new int[size];
        temp = head;
        int i = 0;
        while (temp != null) {
            a[i++] = temp.val;
            temp = temp.next;
        }

        insertionSort(a);
        i = 0;
        temp = head;
        while (temp != null) {
            temp.val = a[i++];
            temp = temp.next;
        }
        return head;
    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int prev = i - 1;
            int curr = a[i];
            while (prev >= 0 && curr < a[prev]) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = curr;
        }

        // System.out.println(Arrays.toString(a));
    }

}