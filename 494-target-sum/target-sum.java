class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for (int x : nums) sum += x;

        if (Math.abs(target) > sum || (sum - target) % 2 != 0) return 0;

        int newTarget = (sum - target) / 2;
        int[][] t = new int[n+1][newTarget+1];
        for (int[] arr: t){
            Arrays.fill(arr, -1);
        }

        return ways(nums, newTarget, nums.length - 1, t);
    }

    public int ways(int[] nums, int target, int n, int[][] t) {
        if (n < 0 && target == 0) return 1;
        if (n < 0 && target != 0) return 0;

        if (t[n][target] != -1) return t[n][target];

        if (nums[n] <= target) {
            return t[n][target] = ways(nums, target - nums[n], n - 1, t) + ways(nums, target, n - 1, t);
        } else {
            return t[n][target] = ways(nums, target, n - 1, t);
        }
    }
}