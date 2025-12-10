class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i=0; i<image.length; i++){
            for (int j=0; j<image[0].length; j++){
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                }
                else if (image[i][j] == 1) {
                    image[i][j] = 0;
                }
            }
        }

        int[][] ans = new int[image.length][image.length];
        for (int i=0; i<image.length; i++){
            int k = 0;
            for (int j=image.length-1; j>=0; j--){
                ans[i][k++] = image[i][j];
            }
        }
        return ans;
    }
}