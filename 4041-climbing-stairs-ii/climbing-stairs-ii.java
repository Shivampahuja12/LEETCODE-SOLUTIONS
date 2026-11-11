
class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climb(costs, n, n, dp);
    }

    public int climb(int[] cost, int n, int i, int[] dp) {

        if (i == 0) return 0;
        if (dp[i] != -1) return dp[i];

        int ans1 = Integer.MAX_VALUE;
        int ans2 = Integer.MAX_VALUE;
        int ans3 = Integer.MAX_VALUE;

        if (i - 1 >= 0) {
            ans1 = climb(cost, n, i - 1, dp) + cost[i - 1] + 1;
        }
        if (i - 2 >= 0) {
            ans2 = climb(cost, n, i - 2, dp) + cost[i - 1] + 4;
        }
        if (i - 3 >= 0) {
            ans3 = climb(cost, n, i - 3, dp) + cost[i - 1] + 9;
        }
        return dp[i] = Math.min(ans1, Math.min(ans2, ans3));
    }
}