class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int p = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                pos[p++] = nums[i];
            else
                neg[n++] = nums[i];
        }
        p = 0;
        n = 0;
        int j = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            nums[j++] = pos[p++];
            nums[j++] = neg[n++];
        }
        return nums;
    }
}