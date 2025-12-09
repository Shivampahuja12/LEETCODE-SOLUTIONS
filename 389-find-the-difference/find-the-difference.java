class Solution {
    public char findTheDifference(String s, String t) {
        int i = 0;
        char ans = '0';
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (i < Math.min(arr1.length, arr2.length)){
            if (arr1[i] != arr2[i]){
                return arr2[i];
            }
            i++;
        }

        return arr2[i];
    }
}