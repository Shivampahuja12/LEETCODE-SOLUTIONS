class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(sum - target);
                if (minDiff > diff) {
                    minDiff = diff;
                    result = sum;
                }
                if (sum == target)
                    return sum;
                else if (sum < target)
                    j++;
                else
                    k--;
            }
        }
        return result;
    }
}