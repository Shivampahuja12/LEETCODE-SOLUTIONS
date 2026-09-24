class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = digitSum(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == i)
                return i;
        }
        return -1;
    }

    public int digitSum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + digitSum(n / 10);
    }
}