class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        return rec(nums, target, lo, hi);
    }

    static int rec(int[] a, int target, int lo, int hi) {
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (a[mid] == target)
            return mid;
        if (a[mid] > target) {
            return rec(a, target, lo, mid - 1);
        } else {
            return rec(a, target, mid + 1, hi);
        }
    }
}