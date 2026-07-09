class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // Store unique triplets
        Set<List<Integer>> ans = new HashSet<>();

        // First loop for first element
        for (int i = 0; i < nums.length; i++) {

            // Set to store elements seen in this iteration
            Set<Integer> set = new HashSet<>();

            // Second loop for second element
            for (int j = i + 1; j < nums.length; j++) {

                // Calculate third element needed
                int third = -(nums[i] + nums[j]);

                // If third already in set, we found a triplet
                if (set.contains(third)) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(list);
                    ans.add(list);
                }

                // Add current element to set
                set.add(nums[j]);
            }
        }
        // Convert set to list
        return new ArrayList<>(ans);
    }
}