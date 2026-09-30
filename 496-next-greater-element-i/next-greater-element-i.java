class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n2 = nums2.length;
        int n1 = nums1.length;
        int[] nge = new int[n2];
        for (int i = n2 - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            if (st.isEmpty())
                nge[i] = -1;
            else
                nge[i] = st.peek();
            st.push(nums2[i]);
        }

        System.out.println(Arrays.toString(nge));
        int[] res = new int[n1];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res[k++] = nge[j];
                }
            }
        }
        return res;
    }
}