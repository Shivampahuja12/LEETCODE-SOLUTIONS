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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        makeArray(list, root);
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return twoSum(arr, k);
    }

    public void makeArray(ArrayList<Integer> list, TreeNode node) {
        if (node == null) return;
        makeArray(list, node.left);
        list.add(node.val);
        makeArray(list, node.right);
    }

    public boolean twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return true;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}