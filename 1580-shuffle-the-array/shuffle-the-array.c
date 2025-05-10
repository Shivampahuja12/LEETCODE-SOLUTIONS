

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int *p = (int*) malloc(numsSize * sizeof(int));
    int k = 0;
    for (int i=0; i<n; i++){
        p[k++] = nums[i];
        p[k++] = nums[n+i];
    }
    *returnSize = k;
    return p;
}