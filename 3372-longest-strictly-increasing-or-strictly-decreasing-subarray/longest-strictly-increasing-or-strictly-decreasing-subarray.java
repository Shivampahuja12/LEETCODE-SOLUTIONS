class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;
        int incSize = 1;
        int decSize = 1;
        int max = 1;
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                if (!flag) incSize = 1;
                incSize++;
                flag = true;
            } else if (nums[i] < nums[i - 1]) {
                if (flag) decSize = 1;
                decSize++;
                flag = false;
            } else {
                incSize = 1;
                decSize = 1;
            }
            max = Math.max(max, Math.max(incSize, decSize));
        }
        return max;
    }
}