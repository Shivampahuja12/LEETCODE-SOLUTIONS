class Solution {
public:
    bool search(vector<int>& nums, int target) {

        // brute - as we are only checking for the element is appeared in the array or not so, first sort the array and find it later using binary search 

        // TC - O(nlogn);
        // SC - O(1);
        /* sort(nums.begin(), nums.end());
        int lo = 0;
        int hi = nums.size() - 1;
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] == target)
                return true;
            else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false; */


        // optimized 
        int lo = 0, hi = nums.size()-1;
        int mid;
        while (lo<=hi){
            mid = lo + (hi-lo)/2;
            if (target == nums[mid]) return true;
            else if (nums[lo] == nums[mid] && nums[mid] == nums[hi]){
                lo++;
                hi--;
                continue;
            }
            else if (nums[lo] <= nums[mid]){
                if (target >= nums[lo] && target < nums[mid]){
                    hi = mid - 1;
                }
                else {
                    lo = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[hi]){
                    lo = mid + 1;
                }
                else {
                    hi = mid -1;
                }
            }
        }
        return false;
    }
};