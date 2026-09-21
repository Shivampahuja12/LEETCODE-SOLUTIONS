class Solution {
    public int findMaxLength(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                arr[i] = -1;
            else
                arr[i] = nums[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int len = 0;
            if (map.containsKey(sum)) {
                len = i - map.get(sum);
                maxLen = Math.max(len, maxLen);
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;

    }
}