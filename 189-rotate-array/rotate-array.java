class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rotates(0, n - 1, nums);
        rotates(0, k - 1, nums);
        rotates(k, n - 1, nums);
    }

    void rotates(int i, int j, int[] a) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}