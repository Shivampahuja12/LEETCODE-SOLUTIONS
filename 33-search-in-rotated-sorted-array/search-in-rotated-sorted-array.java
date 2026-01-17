class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        int mid;
        while (lo <= hi){
            mid = lo + (hi-lo)/2;
            if (nums[mid] == target) return mid;
            if (nums[lo] <= nums[mid]){
                if (target >= nums[lo] && target < nums[mid]){
                    hi = mid-1;
                }
                else {
                    lo = mid+1;
                }
            }
            else {
                if (target <= nums[hi] && target > nums[mid]){
                    lo = mid+1;
                }
                else {
                    hi = mid-1;
                }
            }
        }

        return -1;
    }
}