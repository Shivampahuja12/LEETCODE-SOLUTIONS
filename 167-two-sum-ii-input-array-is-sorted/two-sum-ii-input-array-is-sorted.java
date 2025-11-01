class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        int[] ans = new int[]{0,0};
        while (s<e){
            if (numbers[s] + numbers[e] > target){
                e--;
            }
            else if (numbers[s] + numbers[e] < target){
                s++;
            }
            else {
                ans[0] = s+1;
                ans[1] = e+1;
                break;
            }
        }

        return ans;

    }
}