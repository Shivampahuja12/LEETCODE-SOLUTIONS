class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += nums[i];
            int len = 0;
            int rem = sum % k;
            if (map.containsKey(rem)){
                len = i - map.get(rem);
                if (len >= 2) return true;
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
}