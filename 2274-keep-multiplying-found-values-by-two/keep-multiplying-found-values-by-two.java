class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        boolean n = true;
        while (true){

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
            else {
                n = false;
            }

        }
        // return original;

    }
}