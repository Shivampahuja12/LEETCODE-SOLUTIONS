class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == 1) return 1;

        List<Integer> list = new ArrayList<>(map.keySet());
        int count = 0;
        int max = 0;
        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i) - list.get(i - 1)) == 1) {
                count++;
            } else {
                max = Math.max(max, count+1);
                count = 0;
            }
            max = Math.max(max, count+1);
        }
        return max;
    }
}