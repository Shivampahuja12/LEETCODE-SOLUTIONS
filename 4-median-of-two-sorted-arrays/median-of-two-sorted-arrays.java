class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        // brute force
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int i = 0;
        int j = 0;
        int k = 0;

        int[] res = new int[n1+n2];

        while (i<n1 && j<n2){
            if (nums1[i] < nums2[j]){
                res[k++] = nums1[i++];
            }
            else {
                res[k++] = nums2[j++];
            }
        }

        while (i<n1){
            res[k++] = nums1[i++];
        }

        while (j<n2){
            res[k++] = nums2[j++];
        }

        if (k==0) return 0;

        if (k % 2 == 0){
            System.out.println(Arrays.toString(res));
            return (res[k/2] + res[(k/2)-1])/2.0;
        }
        else {
            System.out.println(Arrays.toString(res));
            return res[k/2];
        }
        
    }
}