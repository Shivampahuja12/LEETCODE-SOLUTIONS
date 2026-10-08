class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int k = 0;
        for (int i = 0; i < n; i += 2) {
            int a = findMin(nums);
            int b = findMin(nums);
            arr[k++] = b;
            arr[k++] = a;
        }
        return arr;
    }

    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1)
                continue;
            else if (nums[i] < min) {
                min = nums[i];
                idx = i;
            }
        }
        nums[idx] = -1;
        return min;
    }
}