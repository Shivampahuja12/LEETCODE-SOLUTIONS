class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd = 0;
        int dd = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10)
                sd += nums[i];
            else
                dd += nums[i];
        }

        if (sd == dd)
            return false;
        else
            return true;
    }
}