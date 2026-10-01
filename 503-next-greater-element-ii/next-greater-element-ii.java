class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] nge2 = new int[n];
        st.push(nums[n - 1]);
        nge2[n - 1] = -1;
        for (int i = 2 * n - 2; i >= 0; i--) {
            int idx = i % n;
            while (!st.isEmpty() && nums[idx] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) nge2[idx] = -1;
            else nge2[idx] = st.peek();
            st.push(nums[idx]);
        }
        return nge2;
    }
}