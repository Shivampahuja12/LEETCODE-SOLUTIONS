class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] t = new int[n + 1][amount + 1];
        for (int[] i : t) {
            Arrays.fill(i, -1);
        }
        return sum(coins, amount, n - 1, t);
    }

    static int sum(int[] arr, int target, int n, int[][] t) {
        if (n < 0 && target == 0)
            return 1;
        if (n < 0 && target != 0)
            return 0;

        if (t[n][target] != -1)
            return t[n][target];

        if (arr[n] <= target) {
            return t[n][target] = sum(arr, target - arr[n], n, t) + sum(arr, target, n - 1, t);
        } else {
            return t[n][target] = sum(arr, target, n - 1, t);
        }
    }

}