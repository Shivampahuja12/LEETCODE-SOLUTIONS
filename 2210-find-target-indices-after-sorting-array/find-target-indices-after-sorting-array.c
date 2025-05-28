/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void sort(int *a, int n){
    for (int i=0; i<n; i++){
        for (int j=i+1; j<n; j++){
            if (a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}
int* targetIndices(int* nums, int numsSize, int target, int* returnSize) {
    int *p = (int *)malloc(numsSize * sizeof(int));
    int k = 0;
    sort(nums, numsSize);
    for (int i=0; i<numsSize; i++){
        if (nums[i] == target){
            p[k++] = i;
        }
    }
    *returnSize = k;
    return p;
}