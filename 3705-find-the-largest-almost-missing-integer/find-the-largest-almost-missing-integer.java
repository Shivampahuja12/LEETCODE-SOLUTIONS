class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                // // count the first window only once
                // if (i == k - 1) {
                //     Set<Integer> seen = new HashSet<>();
                //     int copy = 0;

                //     while (copy <= i) {
                //         if (!seen.contains(nums[copy])) {
                //             seen.add(nums[copy]);
                //             map.put(nums[copy], map.getOrDefault(nums[copy], 0) + 1);
                //         }
                //         copy++;
                //     }
                // }
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            } else {
                left++;
                int copy = left;
                Set<Integer> seen = new HashSet<>();

                while (copy <= i) {
                    if (!seen.contains(nums[copy])) {
                        seen.add(nums[copy]);
                        map.put(nums[copy], map.getOrDefault(nums[copy], 0) + 1);
                    }
                    copy++;
                }
            }
        }
        System.out.println(map);

        int result = -1;
        int largest = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = Math.max(result, entry.getKey());
            }
            largest = Math.max(largest, entry.getKey());
        }
        if (k == nums.length)
            return largest;
        else
            return result;
    }
}