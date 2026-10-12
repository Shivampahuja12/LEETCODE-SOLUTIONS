class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ue = nums[0];
        int le = nums[0];
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            int v1 = ue * nums[i];
            int v2 = le * nums[i];
            int v3 = nums[i];
            ue = Math.max(v1, Math.max(v2, v3));
            le = Math.min(v1, Math.min(v2, v3));
            ans = Math.max(ans, Math.max(ue, le));
        }
        return ans;
    }
}