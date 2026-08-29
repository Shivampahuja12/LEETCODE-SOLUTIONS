class Solution {
    public boolean check(int[] nums) {
        int idx = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);

        for (int i = 1; i < idx; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        System.out.println(idx);

        if (idx == -1)
            return true;

        if (idx == nums.length - 1 && nums[0] < nums[idx])
            return false;
        for (int i = idx + 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1] || nums[0] < nums[nums.length - 1])
                return false;
        }

        System.out.println(idx);
        return true;
    }
}