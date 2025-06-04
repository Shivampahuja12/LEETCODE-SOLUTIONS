int duplicateNumbersXOR(int* nums, int numsSize) {
    int freq[51] = {0};
    for (int i=0; i<numsSize; i++){
        freq[nums[i]]++;
    }
    int xor = 0;
    for (int i=0; i<51; i++){
        if (freq[i] > 1){
            xor ^= i;
        }
    }
    return xor;
}