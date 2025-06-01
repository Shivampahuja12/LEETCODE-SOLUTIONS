int countQuadruplets(int* nums, int numsSize) {
    int count = 0;
    for (int i=0; i<numsSize; i++){
        for (int j=i+1; j<numsSize; j++){
            for (int k=j+1; k<numsSize; k++){
                for (int m=k+1; m<numsSize; m++){
                    if (nums[i] + nums[j] + nums[k] == nums[m]){
                        count++;
                    }
                }
            }
        }
    }
    return count;
}