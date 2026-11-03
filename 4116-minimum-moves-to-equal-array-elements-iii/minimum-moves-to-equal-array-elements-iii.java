class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }
        int moves = 0;
        for (int i = 0; i < n; i++) {
            if (i != idx) {
                moves += max - nums[i];
            }
        }
        return moves;
    }
}