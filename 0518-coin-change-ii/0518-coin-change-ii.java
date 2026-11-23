class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] t = new int[n + 1][amount + 1];
        for (int[] i : t) {
            Arrays.fill(i, -1);
        }
        return cc(coins, amount, n - 1, t);
    }

    public int cc(int[] coins, int amount, int n, int[][] t) {
        if (n < 0 && amount == 0)
            return 1;
        if (n < 0 && amount != 0)
            return 0;
        if (t[n][amount] != -1)
            return t[n][amount];

        if (coins[n] <= amount) {
            return t[n][amount] = cc(coins, amount - coins[n], n, t) + cc(coins, amount, n - 1, t);
        } else {
            return t[n][amount] = cc(coins, amount, n - 1, t);
        }
    }
}