class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        List<String> ans = new ArrayList<>();

        generateAllVals(n, nums[0], "", ans);
        
        String res = "";
        boolean flag;
        for (int i = 0; i < ans.size(); i++) {
            flag = false; // reset flag

            for (int j = 0; j < nums.length; j++) {
                if (ans.get(i).equals(nums[j])) {
                    flag = true;
                    break;
                }
            }

            if (flag == false) {
                res = ans.get(i);
                break;
            }
        }

        return res;
    }

    public void generateAllVals(int n, String s, String emp, List<String> ans) {
        if (s.isEmpty()) {
            ans.add(emp);
            return;
        }
        generateAllVals(n - 1, s.substring(1), emp + "0", ans);
        generateAllVals(n - 1, s.substring(1), emp + "1", ans);
    }
}