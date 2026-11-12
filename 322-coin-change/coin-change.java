class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] t = new int[n+1][amount+1];
        for (int[] i: t){
            Arrays.fill(i, -1);
        }
        int ans = change(coins, amount, n - 1, t);
        return ans == 1e9 ? -1 : ans;
    }

    public static int change(int[] coins, int amount, int n, int[][] t) {
        if (amount == 0) {
            return 0;
        }
        if (n < 0) {
            return (int) 1e9;
        }

        if (t[n][amount] != -1) return t[n][amount];

        if (coins[n] <= amount) {
            return t[n][amount] = Math.min(1+change(coins, amount - coins[n], n, t), change(coins, amount, n - 1, t));
        } else {
            return t[n][amount] = change(coins, amount, n - 1, t);
        }
    }
}