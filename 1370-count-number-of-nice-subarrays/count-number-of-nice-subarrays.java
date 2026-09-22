class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // HM 
        // map.put(psum, freq);
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.gc();
        return ans;
    }
}