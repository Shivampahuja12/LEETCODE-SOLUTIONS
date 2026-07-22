class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;

        HashSet<Integer> totalSet = new HashSet<>();
        for (int num : nums) {
            totalSet.add(num);
        }

        int totalDistinct = totalSet.size();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(nums[j]);

                if (set.size() == totalDistinct) {
                    ans++;
                }
            }
        }

        return ans;
    }
}