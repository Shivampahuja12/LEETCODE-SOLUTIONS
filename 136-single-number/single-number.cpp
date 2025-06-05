class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int space = 0;
        for (int i=0; i<nums.size(); i++){
            space ^= nums[i];
        }
        return space;
    }
};