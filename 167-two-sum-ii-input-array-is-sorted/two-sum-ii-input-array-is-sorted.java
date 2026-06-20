class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0;
        int hi = numbers.length - 1;
        int[] result = new int[2];
        int sum = 0;
        while (lo < hi) {
            sum = numbers[lo] + numbers[hi];
            if (sum == target){
                result = new int[] {lo+1, hi+1};
                return result; 
            }
            if (sum > target) hi--;
            else lo++;
        }
        return result;
    }
}