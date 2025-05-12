class Solution {
public:
    void merge(vector<int>& nums, int st, int mid, int end) {
        vector<int> temp;
        int i = st;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp.push_back(nums[i++]);
            } else {
                temp.push_back(nums[j++]);
            }
        }
        while (i <= mid) {
            temp.push_back(nums[i++]);
        }
        while (j <= end) {
            temp.push_back(nums[j++]);
        }
        for (int k = 0; k < temp.size(); ++k) {
            nums[st + k] = temp[k];
        }
    }

    void mergeSort(vector<int>& nums, int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;
            mergeSort(nums, st, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, st, mid, end);
        }
    }
    vector<int> sortArray(vector<int>& nums) {
        int end = nums.size() - 1;
        mergeSort(nums, 0, end);
        return nums;
    }
};