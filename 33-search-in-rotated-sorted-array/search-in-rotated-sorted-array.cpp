class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n = nums.size();
        int idx;
        bool flag = false;
        for (int i=0; i<n; i++){
            if (target == nums[i]) {
                flag = true;
                idx = i;
                break;
            }
        }
        if (flag == true) return idx;
        else return -1;
    }
};