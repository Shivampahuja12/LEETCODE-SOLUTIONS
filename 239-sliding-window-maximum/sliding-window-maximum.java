class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] ans = new int[n - k + 1];
        int m = 0;
        while (right < n) {
            while (!deque.isEmpty() && deque.peekLast() < nums[right]) {
                deque.pollLast();
            }
            deque.addLast(nums[right]);

            if (right - left + 1 < k) {
                right++;
            }

            else if (right - left + 1 == k) {
                ans[m++] = deque.peekFirst();

                if (deque.peekFirst() == nums[left]) {
                    deque.pollFirst();
                }

                left++;
                right++;
            }
        }
        return ans;
    }
}