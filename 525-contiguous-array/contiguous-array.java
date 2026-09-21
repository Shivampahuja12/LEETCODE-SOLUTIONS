class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                arr[i] = -1;
            else
                arr[i] = nums[i];
        }
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            int length = 0;
            sum += arr[i];
            if (map.containsKey(sum)) {
                length = i - map.get(sum);
                maxLen = Math.max(maxLen, length);
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}