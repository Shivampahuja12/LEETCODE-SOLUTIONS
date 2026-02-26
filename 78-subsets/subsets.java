class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> smlList = new ArrayList<>();
        subs(0, nums, list, smlList);
        return list;
    }
    public static void subs(int i, int[] a, List<List<Integer>> list, List<Integer> smlList){
        if (i == a.length) {
            list.add(new ArrayList(smlList));
            return;
        }

        // include
        smlList.add(a[i]);
        subs(i+1, a, list, smlList);

        // exclude
        smlList.remove(smlList.size() - 1);
        subs(i+1, a, list, smlList);
    }
}