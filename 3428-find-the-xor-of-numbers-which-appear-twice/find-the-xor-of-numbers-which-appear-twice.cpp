class Solution {
public:
    int duplicateNumbersXOR(vector<int>& nums) {
        int freq[51] = {0};
        for (int i = 0; i < nums.size(); i++) {
            freq[nums[i]]++;
        }
        int xo =0;
        // xor = 0;
        for (int i = 0; i < 51; i++) {
            if (freq[i] > 1) {
                xo ^= i;
            }
        }
        return xo;
    }
};