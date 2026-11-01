class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // taking some elements and removing some
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        subset(nums, inner, list, 0);
        return list;
    }

    public void subset(int[] nums, List<Integer> inner, List<List<Integer>> list, int i) {
        if (i == nums.length) {
            list.add(new ArrayList(inner));
            return;
        }

        //take
        inner.add(nums[i]);
        subset(nums, inner, list, i + 1);
        //not-take
        inner.remove(inner.size() - 1);
        subset(nums, inner, list, i + 1);
    }

}