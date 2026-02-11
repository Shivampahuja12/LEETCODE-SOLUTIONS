class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        int lo = 0;
        int hi = numbers.length - 1;
        while (lo < hi) {
            if (numbers[lo] + numbers[hi] == target) {
                a[0] = lo + 1;
                a[1] = hi + 1;
                break;
            } else if (numbers[lo] + numbers[hi] > target) {
                hi--;
            } else {
                lo++;
            }
        }
        return a;
    }
}