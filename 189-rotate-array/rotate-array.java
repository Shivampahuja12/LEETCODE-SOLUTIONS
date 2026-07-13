class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;
        rotate(0, n - 1, nums);
        rotate(0, k - 1, nums);
        rotate(k, n - 1, nums);
        System.gc();
    }

    static void rotate(int i, int j, int[] a) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}