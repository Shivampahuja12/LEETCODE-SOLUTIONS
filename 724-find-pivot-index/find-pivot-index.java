class Solution {
    public int pivotIndex(int[] nums) {
        int lSum = 0;
        int rSum = 0;
        for (int i = 0; i < nums.length; i++) {
            lSum = 0;
            for (int j = 0; j < i; j++) {
                lSum += nums[j];
            }
            rSum = 0;
            for (int k = i + 1; k < nums.length; k++) {
                rSum += nums[k];
            }
            if (lSum == rSum) {
                return i;
            }
        }
        return -1;
    }
}