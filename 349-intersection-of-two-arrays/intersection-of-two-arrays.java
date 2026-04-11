class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for (int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        
        for (int i=0; i<nums2.length; i++){
            if (set1.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }

        int[] array = new int[ans.size()];
        int k = 0;
        for (int i: ans){
            array[k++] = i;
        }

        return array;
    }
}