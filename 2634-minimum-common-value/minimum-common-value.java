class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        // int min1 = Integer.MAX_VALUE;
        // int min2 = Integer.MAX_VALUE;
        // for (int i=0; i<nums1.length; i++){
        //     if (nums1[i] < min1){
        //         min1 = nums1[i];
        //     }
        // }

        // for (int i=0; i<nums2.length; i++){
        //     if (nums2[i] < min2){
        //         min2 = nums2[i];
        //     }
        // }

        // char ch = min1 > min2 ? '1' : '2';
        // int min = min1 > min2 ? min1 : min2;

        // if (ch == '1'){
        //     boolean flag = true;
        //     for (int i=0; i<nums2.length; i++){
        //         if (min == nums2[i]){
        //             flag = false;
        //             return nums2[i];
        //         }
        //     }
        //     if (flag) return -1;
        // }

        // if (ch == '2'){
        //     boolean flag = true;
        //     for (int i=0; i<nums1.length; i++){
        //         if (min == nums1[i]){
        //             flag = false;
        //             return nums1[i];
        //         }
        //     }
        //     if (flag) return -1;
        // }

        // return -1;



        for (int i=0; i<nums1.length; i++){
            int ans = bs(nums1[i], nums2);
            if (ans != -1) return ans;
        }
        return -1;
    }

    static int bs(int i, int[] a){
        int lo = 0;
        int hi = a.length-1;
        int mid;
        while (lo <= hi){
            mid = lo + (hi-lo)/2;
            if (a[mid] == i){
                return a[mid];
            }
            else if (a[mid] > i){
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return -1;
    }
}