class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int bs = nums[0];
        for (int i = 1; i < n; i++) {
            int v1 = bs + nums[i];
            int v2 = nums[i];
            bs = Math.max(v1, v2);
            max = Math.max(max, bs);
        }
        return max;
    }
}