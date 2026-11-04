class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= k)
                continue;
            if (map.containsKey(k - nums[i])) {
                map.put(k - nums[i], map.get(k - nums[i]) - 1);
                if (map.get(k - nums[i]) == 0) {
                    map.remove(k - nums[i]);
                }
                count++;
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }
}