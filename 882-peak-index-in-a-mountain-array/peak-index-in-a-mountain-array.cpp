class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int n = arr.size();
        int idx = -1;
        for (int i = 1; i < n - 1; i++) {
            if ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])){
                idx = i;
                break;
            }
        }
        return idx;
    }
};