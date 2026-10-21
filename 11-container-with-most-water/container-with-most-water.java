class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int max = Integer.MIN_VALUE;
        while (l < r) {
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            int currWater = w * h;
            max = Math.max(max, currWater);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}