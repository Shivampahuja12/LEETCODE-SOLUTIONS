class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        int mid;
        int min = Integer.MAX_VALUE;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[lo] <= nums[mid]) {
                min = Math.min(min, nums[lo]);
                lo = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                hi = mid - 1;
            }
        }
        return min;
    }
}