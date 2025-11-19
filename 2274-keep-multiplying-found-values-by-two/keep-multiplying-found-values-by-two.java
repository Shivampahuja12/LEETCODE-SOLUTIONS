class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        /* while (true){
            boolean isFound = false;
            for (int i=0; i<nums.length; i++){
                if (nums[i] == original){
                    original *= 2;
                    isFound = true;
                    break;
                }
            }

            if (isFound == false){
                return original;
            }
        } */


        Arrays.sort(nums);
        while (true){
            boolean isFound = false;
            
            int lo = 0;
            int hi = nums.length - 1;
            int mid;
            while (lo<=hi){
                mid = lo + (hi-lo)/2;
                if (nums[mid] == original){
                    original *= 2;
                    isFound = true;
                    break;
                }
                else if (nums[mid] < original){
                    lo = mid + 1;
                }
                else {
                    hi = mid - 1;
                }
            }

            if (isFound == false){
                return original;
            }
        }
    }
}