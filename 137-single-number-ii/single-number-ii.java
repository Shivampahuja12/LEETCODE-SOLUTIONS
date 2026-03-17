class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int check = 0;
        for (int i=1; i<nums.length; i++){
            if (i % 3 == 0){
                check = 0;
                continue;
            }
            else if (nums[i] != nums[i-1]){
                return nums[i-1];
            }
            check++;
        }

        return nums[nums.length-1];
    }
}