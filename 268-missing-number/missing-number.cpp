class Solution {
public:
    int missingNumber(vector<int>& nums) {
        // vector <int> v = nums;
        // v.resize(nums.size()+1);
        // v.sort(v.begin(), v.end());
        sort(nums.begin(), nums.end());

        int lo = 0; 
        int hi = nums.size()-1;
        int mid;
        int ans;
        while (lo <= hi){
            mid = lo + (hi - lo)/2;
            if (nums[mid] == mid){
                ans = mid;
                lo = mid + 1;
            }
            else {
                if(lo == hi && nums[mid] != mid) return mid;
                hi = mid;
            }
        }
        
        return ans + 1;


    }
};