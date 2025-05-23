/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDuplicates(int* nums, int numsSize, int* returnSize) {
    /* int *p = (int *)malloc(numsSize*sizeof(int));
    int k = 0;
    for (int i=0; i<numsSize; i++){
        for (int j=i+1; j<numsSize; j++){
            if (nums[i] == nums[j] && i!=j){
                p[k++] = nums[j];
            }
        }
    }
    *returnSize = k;
    return p; */
    int freq[100001] = {0};
    for (int i=0; i<numsSize; i++){
        freq[nums[i]]++;
    }
    int *p = (int *)malloc(numsSize * sizeof(int));
    int k=0;
    for (int i=0; i<100001; i++){
        if (freq[i] > 1){
            p[k++] = i;
        }
    }
    *returnSize = k;
    return p;
}