class Solution {

    long MOD = 1_000_000_007;

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] power = new long[n];
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        int l = 0;
        int r = n - 1;
        long answer = 0;
        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                answer = (answer + power[r - l]) % MOD;
                l++;
            } else {
                r--;
            }
        }
        return (int) answer;
    }
}