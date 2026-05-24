class Solution {
    public int minimumSwaps(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int swaps = 0;
        while (i <= j) {
            if (nums[i] == 0 && nums[j] != 0) {
                swaps++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (nums[i] != 0 && nums[j] != 0) {
                i++;
            } else if ((nums[i] != 0 && nums[j] == 0) || (nums[i] == 0 && nums[j] == 0)) {
                j--;
            }
        }
        return swaps;
    }
}