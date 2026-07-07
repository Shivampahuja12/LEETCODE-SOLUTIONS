class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        if (nums[n - 1] < 0) {
            square(nums);
            reverse(nums);
            return nums;
        } else {
            int neg = 0;
            while (nums[neg] < 0) {
                neg++;
            }
            int[] negs = new int[neg];
            int[] pos = new int[n - neg];

            for (int i = 0; i < neg; i++) {
                negs[i] = nums[i] * nums[i];
            }
            int k = 0;
            for (int i = neg; i < n; i++) {
                pos[k++] = nums[i] * nums[i];
            }
            reverse(negs);
            int[] merged = mergedArr(negs, pos);
            return merged;
        }
    }

    public void square(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
    }

    public int[] mergedArr(int[] a1, int[] a2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[a1.length + a2.length];
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }
        while (i < a1.length) {
            result[k++] = a1[i++];
        }
        while (j < a2.length) {
            result[k++] = a2[j++];
        }
        return result;
    }

    public void reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}