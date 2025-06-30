class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        /* // brute force 
        int n = arr.size();
        int idx = -1;
        for (int i = 1; i < n - 1; i++) {
            if ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])){
                idx = i;
                break;
            }
        }
        return idx; */


        // binary search
        int lo = 0;
        int hi = arr.size()-1;
        int mid;
        while (lo<hi){
            mid = lo + (hi-lo)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] < arr[mid+1]) lo = mid+1;
            else if(arr[mid] >= arr[mid+1]) hi = mid;
        }
        return lo;
    }
};