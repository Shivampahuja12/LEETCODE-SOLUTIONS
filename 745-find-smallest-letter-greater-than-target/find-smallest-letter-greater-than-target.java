class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        

        // brute 

        // if ()
        for (int i=0; i<letters.length; i++){
            if ((int)target < (int)letters[i]){
                return letters[i];
            } 

            if ((int)target == letters[i] && (int)target != (int)letters[letters.length-1] && (int)target != (int)letters[i+1]){
                return letters[i+1];
            }
        
        }
        return letters[0];


        // int lo = 0;
        // int hi = letters.length - 1;

        // int mid;
        // int ans = 0;
        // while (lo <= hi){
        //     mid = lo + (hi-lo)/2;
        //     if ((int)letters[mid] > (int)target){
        //         // ans = mid;
        //         hi = mid - 1;
        //     }
        //     else {
        //         ans = mid;
        //         lo = mid + 1;
        //     }

        // }

        // if ((int)letters[ans] > ((int) target)){
        //     return letters[0];
        // }
        // else {
        //     return letters[ans];
        // }
    }
}