class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int lo = 0;
        int hi = nums.size() - 1;
        int mid;
        int ans1=-1;
        int ans2=-1;
        vector<int> v;

        // first occurance
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                ans1 = mid;
                hi = mid - 1;
            }
            if (nums[mid] < target) {
                lo = mid + 1;
            }
            if (nums[mid] > target) {
                hi = mid - 1;
            }
        }

        // last occurance
        lo = 0;
        hi = nums.size() - 1;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                ans2 = mid;
                lo = mid + 1;
            }
            if (nums[mid] < target) {
                lo = mid + 1;
            }
            if (nums[mid] > target) {
                hi = mid - 1;
            }
        }

        
        v.push_back(ans1);
        v.push_back(ans2);
        return v;
    }
};