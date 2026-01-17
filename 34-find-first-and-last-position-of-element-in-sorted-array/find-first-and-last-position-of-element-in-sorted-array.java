class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = first(nums, nums.length, target);
        ans[1] = last(nums, nums.length, target);
        return ans;
    }
    public static int first(int[] a, int n, int k){
        int lo = 0;
        int hi = n-1;
        int mid;
        int ans = -1;
        while (lo <= hi){
            mid = lo + (hi-lo)/2;
            if (a[mid] == k){
                ans = mid;
                hi = mid-1;
            }
            if (a[mid] < k) {
                lo = mid+1;
            }
            if (a[mid] > k){
                hi = mid-1;
            }
        }
        return ans;
    }
    public static int last(int[] a, int n, int k){
        int lo = 0;
        int hi = n-1;
        int mid;
        int ans = -1;
        while (lo <= hi){
            mid = lo + (hi-lo)/2;
            if (a[mid] == k){
                ans = mid;
                lo = mid+1;
            }
            if (a[mid] < k) {
                lo = mid+1;
            }
            if (a[mid] > k){
                hi = mid-1;
            }
        }
        return ans;
    }
}