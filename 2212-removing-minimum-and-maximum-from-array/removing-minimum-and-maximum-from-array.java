class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;

        int minIdx = -1;
        int maxIdx = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIdx = i;
            }
            if (min > nums[i]) {
                min = nums[i];
                minIdx = i;
            }
        }

        if (minIdx > maxIdx){
            int f = minIdx + 1;
            int l = n - maxIdx;
            int bt = (maxIdx + 1) + (n - minIdx);
            return Math.min(f, Math.min(l, bt));
        } else {
            int f = maxIdx + 1;
            int l = n - minIdx;
            int bt = (minIdx + 1) + (n - maxIdx);
            return Math.min(f, Math.min(l, bt));
        }
    }
}