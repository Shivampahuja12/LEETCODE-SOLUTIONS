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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrderTraversal(list, root);
        return list;
    }

    public void levelOrderTraversal(List<List<Integer>> outer, TreeNode root){
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> inner = new ArrayList<>();
            for (int i=0; i<size; i++){
                TreeNode value = q.poll();
                inner.add(value.val);
                if (value.left != null) q.add(value.left);
                if (value.right != null) q.add(value.right);
            }
            outer.add(inner);
        }

    }
}