class Solution {
public:
    void sortColors(vector<int>& nums) {
        int m = 0;
        vector<int> a = nums;
        for (int i=0; i<a.size(); i++){
            if (a[i] == 0) nums[m++] = 0;
        }
        for (int i=0; i<a.size(); i++){
            if (a[i] == 1) nums[m++] = 1;
        }
        for (int i=0; i<a.size(); i++){
            if (a[i] == 2) nums[m++] = 2;
        }
    }
};