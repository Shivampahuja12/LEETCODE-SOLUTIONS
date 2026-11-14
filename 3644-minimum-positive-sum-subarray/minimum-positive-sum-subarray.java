class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int j = 0;
        int minSum = Integer.MAX_VALUE;
        while (j < n) {
            int sum = 0;
            int i = j;
            while (i < n) {
                sum += nums.get(i);
                int len = i - j + 1;
                if (len >= l && len <= r && sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
                if (len > r) break;
                
                i++;
            }
            j++;
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}