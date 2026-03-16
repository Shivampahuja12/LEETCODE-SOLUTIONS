class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int[] result = new int[2];
        int k = 0;

        for (int i=0; i<nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        } 

        for (Map.Entry<Integer, Integer> entry: mpp.entrySet()){
            if (entry.getValue() == 1){
                result[k++] = entry.getKey();
            }
            if (k == 2) break;
        }

        return result;
    }  
}