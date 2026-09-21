class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // map.put(remainder, index)
        map.put(0, -1);
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int length = 0;
            sum += nums[i];
            int rem = sum % k;
            if (map.containsKey(rem)) {
                length = i - map.get(rem);
                if (length >= 2)
                    return true;
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
}