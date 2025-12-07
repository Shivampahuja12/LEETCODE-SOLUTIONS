class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int curr = k;
        List<Integer> ans = new ArrayList();

        for (int i=n-1; i>=0 || curr > 0; i--){
            if (i>=0) curr += num[i];
            if (curr > 9 && i == 0 && n > 2){
                ans.add(curr % 10);
                ans.add(curr / 10);
                break;
            }
            ans.add(curr % 10);
            curr /= 10;
        }
        

        Collections.reverse(ans);
        return ans;
    }
}