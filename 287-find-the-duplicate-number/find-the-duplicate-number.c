int findDuplicate(int* nums, int numsSize) {
    int freq[100001] = {0};
    for (int i=0; i<numsSize; i++){
        freq[nums[i]]++;
    }
    int ans = -1;
    for (int i=0; i<100001; i++){
        if (freq[i] > 1){
            ans = i;
        }
    }
    return ans;
}