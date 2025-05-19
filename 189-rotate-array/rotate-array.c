void rotateArray(int *a, int s, int e){
    while (s < e){
        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;
        s++;
        e--;
    }
}

void rotate(int* nums, int numsSize, int k) {
    k = k % numsSize;
    rotateArray(nums, 0, numsSize-1);
    rotateArray(nums, 0, k-1);
    rotateArray(nums, k, numsSize-1);
}