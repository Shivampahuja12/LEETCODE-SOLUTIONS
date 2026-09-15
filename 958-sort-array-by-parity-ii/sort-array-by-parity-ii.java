class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>(nums.length / 2);
        ArrayList<Integer> odd = new ArrayList<>(nums.length / 2);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        int[] res = new int[nums.length];
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) res[r++] = even.remove(0);
            else res[r++] = odd.remove(0);
        }
        return res;
    }
}