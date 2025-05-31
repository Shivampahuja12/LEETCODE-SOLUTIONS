/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

void sq(int *num){
    *num = (*num)*(*num);
}
void sorting(int *a, int n){
    for (int i=0; i<n; i++){
        for (int j=i+1; j<n; j++){
            if (a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}
int* sortedSquares(int* nums, int numsSize, int* returnSize) {
    int *p = (int *)malloc(numsSize * sizeof(int));

    //squaring each element 
    for (int i=0; i<numsSize; i++){
        sq(&nums[i]);
    }

    // sorting
    sorting(nums, numsSize);

    int k=0;
    for (int i=0; i<numsSize; i++){
        p[k++] = nums[i];
    }

    *returnSize = k;
    return p;
    free(p);
}