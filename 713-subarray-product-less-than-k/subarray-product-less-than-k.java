class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 0)
            return 0;
        int n = nums.length;
        int left = 0;
        int c = 0;
        int prod = 1;
        for (int right = 0; right < n; right++) {
            prod *= nums[right];
            while (prod >= k && left <= right) {
                prod /= nums[left];
                left++;
            }
            c += right - left + 1;
        }
        return c;
    }
}