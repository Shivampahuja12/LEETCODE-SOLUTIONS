class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return rec(nums, 0, -1, dp);
    }

    public int rec(int[] nums, int idx, int lastIdx, int[][] dp) {
        if (idx == nums.length) {
            return 0;
        }

        if (dp[idx][lastIdx + 1] != -1) {
            return dp[idx][lastIdx + 1];
        }

        int pick = 0;
        if (lastIdx == -1 || nums[idx] > nums[lastIdx]) {
            pick = 1 + rec(nums, idx + 1, idx, dp);
        }
        int skip = 0 + rec(nums, idx + 1, lastIdx, dp);

        dp[idx][lastIdx + 1] = Math.max(pick, skip);
        return dp[idx][lastIdx + 1];
    }
}