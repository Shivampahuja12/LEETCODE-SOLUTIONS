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
    public ListNode sortList(ListNode head) {
        // ListNode temp = head;
        // ArrayList<Integer> list = new ArrayList<>();
        // while (temp != null){
        //     list.add(temp.val);
        //     temp = temp.next;
        // }

        // for (int i=0; i<list.size(); i++){
        //     for (int j=i+1; j<list.size(); j++){
        //         if (list.get(i) > list.get(j)){
        //             int tempper = list.get(i);
        //             list.set(i, list.get(j));
        //             list.set(j, tempper);
        //         }
        //     }
        // }

        // int i = 0;
        // temp = head;
        // while (temp != null){
        //     temp.val = list.get(i++);
        //     temp = temp.next;
        // }

        // return head;

        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        ArrayList<Integer> ans = mergeSort(list);

        int i = 0;
        temp = head;
        while (temp != null) {
            temp.val = ans.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        int mid = list.size() / 2;
        if (list.size() <= 1)
            return list;

        // ArrayList<Integer> left = new ArrayList<>(list.sublist(0, mid));
        List<Integer> sublist1 = list.subList(0, mid);
        ArrayList<Integer> left = new ArrayList<>(sublist1);
        left = mergeSort(left);

        // ArrayList<Integer> right = new ArrayList<>(list.sublist(mid, list.size()));
        List<Integer> sublist2 = list.subList(mid, list.size());
        ArrayList<Integer> right = new ArrayList<>(sublist2);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0;
        int j = 0;
        int k = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}