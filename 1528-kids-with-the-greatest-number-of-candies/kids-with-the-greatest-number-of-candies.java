class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        
        ArrayList<Boolean> bool = new ArrayList<>();

        int max = candies[0];

        for (int i=0; i<n; i++){
            if (max <= candies[i]){
                max = candies[i];
            }
        }

        for (int i=0; i<n; i++){
            candies[i] = candies[i] + extraCandies;
        }

        for (int i=0; i<n; i++){
            if (candies[i] >= max){
                bool.add(true);
            }
            else {
                bool.add(false);
            }

        }

        return bool;
    }
}