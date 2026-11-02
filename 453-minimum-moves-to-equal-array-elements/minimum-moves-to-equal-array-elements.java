class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int idx = 0;
        int minSteps = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < min) {
                min = Math.min(min, nums[i]);
                idx = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != idx) {
                minSteps += Math.abs(nums[i] - min);
            }
        }
        return minSteps;
    }
}