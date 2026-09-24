class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = digitSum(nums[i]);
            if (num == i)
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