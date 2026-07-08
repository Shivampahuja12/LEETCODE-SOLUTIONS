class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer idx = map.get(nums[i]);
                System.out.println(idx);
                if (Math.abs(idx - i) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}