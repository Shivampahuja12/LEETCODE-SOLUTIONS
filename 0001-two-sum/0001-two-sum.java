class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int need = target - num;
            if (map.containsKey(need)) {
                a[0] = map.get(need);
                a[1] = i;
                return a;
            }
            map.put(nums[i], i);
        }
        return a;
    }
}