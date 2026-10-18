class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        subset(list, inner, 0, nums);
        return list;
    }

    public void subset(List<List<Integer>> list, List<Integer> inner, int i, int[] arr) {

        if (i == arr.length) {
            list.add(new ArrayList(inner));
            return;
        }

        inner.add(arr[i]);
        subset(list, inner, i + 1, arr);

        inner.remove(inner.size() - 1);
        subset(list, inner, i + 1, arr);
    }
}