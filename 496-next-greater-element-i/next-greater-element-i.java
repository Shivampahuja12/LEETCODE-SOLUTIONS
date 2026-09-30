class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n2 = nums2.length;
        int n1 = nums1.length;
        map.put(nums2[n2 - 1], -1);
        st.push(nums2[n2 - 1]);

        for (int i = n2 - 2; i >= 0; i--) {
            if (st.peek() > nums2[i]) {
                map.put(nums2[i], st.peek());
                st.push(nums2[i]);
            } else {
                while (!st.isEmpty() && nums2[i] > st.peek()) {
                    st.pop();
                }
                if (st.isEmpty())
                    map.put(nums2[i], -1);
                else
                    map.put(nums2[i], st.peek());
                st.push(nums2[i]);
            }
        }

        int[] res = new int[n1];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}