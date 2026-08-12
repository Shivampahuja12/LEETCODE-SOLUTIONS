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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(root, list, sb);
        return list;
    }

    public static void dfs(TreeNode root, List<String> list, StringBuilder sb) {
        if (root == null)
            return;
        int length = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(sb.toString());
        } else {
            sb.append("->");
            dfs(root.left, list, sb);
            dfs(root.right, list, sb);
        }
        sb.setLength(length);
    }
}