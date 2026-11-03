class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            sum += i;
        }
        return max * n - sum;
    }
}