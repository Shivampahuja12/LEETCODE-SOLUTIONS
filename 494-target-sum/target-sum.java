class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int x : nums) sum += x;

        if (Math.abs(target) > sum || (sum - target) % 2 != 0) return 0;

        int newTarget = (sum - target) / 2;

        return ways(nums, newTarget, nums.length - 1);
    }

    public int ways(int[] nums, int target, int n) {
        if (n < 0 && target == 0) return 1;
        if (n < 0 && target != 0) return 0;

        if (nums[n] <= target) {
            return ways(nums, target - nums[n], n - 1) + ways(nums, target, n - 1);
        } else {
            return ways(nums, target, n - 1);
        }
    }
}