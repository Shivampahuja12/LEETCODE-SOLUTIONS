class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        int[] res = new int[nums.length];
        int i = 0;
        int it = 0;
        while (it < even.size()) {
            res[i++] = even.get(it);
            it++;
        }
        it = 0;
        while (it < odd.size()) {
            res[i++] = odd.get(it);
            it++;
        }
        return res;
    }
}