// void checkDig(int n){
//     for (int j=n; j>0; j/=10){}
//     if (j%2==0) count++;
// }

int findNumbers(int* nums, int numsSize) {
    int count = 0;
    for (int i = 0; i < numsSize; i++) {
        int dig = 0;
        for (int j = nums[i]; j > 0; j /= 10) {
            dig++;
        }
        if (dig % 2 == 0)
            count++;
        // checkDig(nums[i]);
    }
    return count;
}