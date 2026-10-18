class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> eql = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot)
                left.add(nums[i]);
            else if (nums[i] == pivot)
                eql.add(nums[i]);
            else
                right.add(nums[i]);
        }
        
        int[] arr = new int[n];
        int idx = 0;
        for (int i : left) {
            arr[idx++] = i;
        }
        for (int i : eql) {
            arr[idx++] = i;
        }
        for (int i : right) {
            arr[idx++] = i;
        }
        return arr;
    }
}