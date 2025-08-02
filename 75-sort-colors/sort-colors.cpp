class Solution {
public:
    void sortColors(vector<int>& nums) {
        /*
        // 1
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
        } */

        /* // 2 - counting method
        int cntZero = 0;
        int cntOne = 0;
        int cntTwo = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == 0)
                cntZero++;
            else if (nums[i] == 1)
                cntOne++;
            else if (nums[i] == 2)
                cntTwo++;
        }

        int m = 0;
        for (int i = 0; i < cntZero; i++) {
            nums[m++] = 0;
        }
        for (int i = 0; i < cntOne; i++) {
            nums[m++] = 1;
        }
        for (int i = 0; i < cntTwo; i++) {
            nums[m++] = 2;
        } */

        // 3 - three pointer approach
        int lo = 0;
        int mid = 0;
        int hi = nums.size() - 1;
        while (mid <= hi) {
            if (nums[mid] == 0) {
                swap(nums[lo], nums[mid]);
                lo++, mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums[mid], nums[hi]);
                hi--;
            }
        }
    }
};