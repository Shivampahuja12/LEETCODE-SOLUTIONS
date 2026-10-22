class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int max = 0;
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                c++;
            } else {
                c = 0;
            }
            max = Math.max(c, max);
        }
        return max + 1;
    }
}