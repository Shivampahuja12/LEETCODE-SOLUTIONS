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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        zigzag(list, root, 0);
        return list;
    }

    public void zigzag(List<List<Integer>> outer, TreeNode root, int level) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> inner = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                inner.add(node.val);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            if (level % 2 != 0) {
                Collections.reverse(inner);
                outer.add(inner);
            } else {
                outer.add(inner);
            }
            level++;
        }
    }
}