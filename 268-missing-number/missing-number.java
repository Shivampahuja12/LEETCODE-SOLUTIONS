class Solution {
    public int missingNumber(int[] nums) {

        int sumNums = (nums.length * (nums.length+1))/2;
        int sumArray = 0;
        for (int i=0; i<nums.length; i++){
            sumArray += nums[i];
        }

        return sumNums - sumArray;
    }
}