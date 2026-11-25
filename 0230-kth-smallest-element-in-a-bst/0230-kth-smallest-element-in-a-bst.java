/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        addElements(list, root, 0);
        return list.get(k - 1);
    }

    public void addElements(ArrayList<Integer> list, TreeNode root, int i) {
        if (root == null) return;
        addElements(list, root.left, i);
        list.add(root.val);
        addElements(list, root.right, i);
    }
}