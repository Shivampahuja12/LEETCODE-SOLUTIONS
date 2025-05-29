/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize) {
    int *p = (int *)malloc(numsSize * 2 * sizeof(int));

    int k = 0;
    for (int i=0; i<numsSize; i++){
        p[k++] = nums[i];
    }
    for (int i=0; i<numsSize; i++){
        p[k++] = nums[i];
    }
    *returnSize = k;
    return p;
}