class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) sum += -1;
            else sum += nums[i];

            int len = 0;
            if (map.containsKey(sum)) {
                len = i - map.get(sum);
                max = Math.max(max, len);
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}