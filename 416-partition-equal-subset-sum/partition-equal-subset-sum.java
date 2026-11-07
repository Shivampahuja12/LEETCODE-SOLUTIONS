class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) sum += nums[i];

        if (sum % 2 != 0) return false;
        int target = sum / 2;
        boolean[][] t = new boolean[n + 1][target + 1];

        for (boolean[] arr : t) Arrays.fill(arr, true);
        
        return canWe(nums, n - 1, target, t);
    }

    public boolean canWe(int[] arr, int n, int sum, boolean[][] t) {
        if (sum == 0) return true;
        if (n < 0) return false;

        if (t[n][sum] != true)
            return t[n][sum];

        if (arr[n] <= sum) {
            return t[n][sum] = canWe(arr, n - 1, sum - arr[n], t) || canWe(arr, n - 1, sum, t);
        } else {
            return t[n][sum] = canWe(arr, n - 1, sum, t);
        }
    }
}