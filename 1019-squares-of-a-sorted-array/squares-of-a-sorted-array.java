class Solution {
    public int[] sortedSquares(int[] nums) {
        int idx = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < 0 && nums[i + 1] >= 0) {
                idx = i;
                break;
            }
        }

        int[] resultantArray = new int[nums.length];
        int k = 0;

        // CASE: All numbers are non-negative
        if (idx == -1 && nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                resultantArray[k++] = nums[i] * nums[i];
            }
        }

        // CASE: All numbers are negative
        else if (idx == -1 && nums[nums.length - 1] < 0) {
            int start = nums.length - 1;
            while (start >= 0) {
                resultantArray[k++] = nums[start] * nums[start];
                start--; //
            }
        }

        // CASE: Mixed negative and positive
        else {
            int lo = idx;
            int hi = idx + 1;

            while (lo >= 0 && hi < nums.length) {
                int small = nums[lo] * nums[lo];
                int large = nums[hi] * nums[hi];

                if (small <= large) {
                    resultantArray[k++] = small;
                    lo--;
                } else {
                    resultantArray[k++] = large;
                    hi++;
                }
            }

            while (lo >= 0) {
                resultantArray[k++] = nums[lo] * nums[lo];
                lo--;
            }

            while (hi <= nums.length - 1) {
                resultantArray[k++] = nums[hi] * nums[hi];
                hi++;
            }
        }

        return resultantArray;
    }
}