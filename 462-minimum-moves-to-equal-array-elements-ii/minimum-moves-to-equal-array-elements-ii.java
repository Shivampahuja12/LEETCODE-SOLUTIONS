class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        int avg = 0;
        if (n % 2 == 0) {
            int mid = lo + (hi - lo) / 2;
            avg = (nums[mid] + nums[mid + 1]) / 2;

        } else {
            int mid = lo + (hi - lo) / 2;
            avg = nums[mid];
        }

        int min = 0;
        for (int i = 0; i < n; i++) {
            min += Math.abs(nums[i] - avg);
        }

        return min;
    }
}