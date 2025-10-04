class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxi = 0;
        int i=0;
        while (i<nums.length){
            if (nums[i] == 1){
                cnt++;
            }
            else {
                cnt = 0;
            }
            i++;
            maxi = cnt > maxi ? cnt : maxi;
        }

        return maxi;
    }
}