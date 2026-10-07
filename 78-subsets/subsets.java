class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> inn = new ArrayList<>();
        subs(0, list, nums, inn);
        return list;
    }

    public void subs(int i, List<List<Integer>> list, int[] nums, List<Integer> inn) {
        if (i == nums.length) {
            list.add(new ArrayList(inn));
            return;
        }
        //add
        inn.add(nums[i]);
        subs(i + 1, list, nums, inn);
        //no add
        inn.remove(inn.size() - 1);
        subs(i + 1, list, nums, inn);
    }
}