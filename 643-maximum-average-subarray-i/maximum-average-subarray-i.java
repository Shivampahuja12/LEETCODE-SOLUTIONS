class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        double sum = 0;
        double max = Integer.MIN_VALUE;

        while (j < n) {
            sum += nums[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(sum / k, max);
                sum -= nums[i];
                i++;
                j++;
            }
            System.out.println(i + " " + j);
        }

        return max;
    }
}