int singleNumber(int* nums, int numsSize) {
    int space = 0;
    for (int i=0; i<numsSize; i++){
        space ^= nums[i];
    }
    return space;
}