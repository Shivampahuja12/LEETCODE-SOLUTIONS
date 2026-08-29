class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        set(0, list, nums, innerList);
        return list;
    }

    void set(int i, List<List<Integer>> list, int[] arr, List<Integer> innerList) {
        if (i >= arr.length) {
            list.add(new ArrayList(innerList));
            return;
        }

        // include
        innerList.add(arr[i]);
        set(i + 1, list, arr, innerList);

        //exclude
        innerList.remove(innerList.size() - 1);
        set(i + 1, list, arr, innerList);

    }
}