class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int still = 0;
        int vary = still+1;
        while (vary < nums.length){
            if (nums[still] == nums[vary]){
                vary++;
            }
            else {
                still++;
                nums[still] = nums[vary];
            }
        }
        return still+1;
    }
}