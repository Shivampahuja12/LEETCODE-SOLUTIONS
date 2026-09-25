class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);
        p = String.valueOf(pArray);
        int left = 0;
        int n = s.length();
        int k = p.length();
        for (int i=0; i<n; i++){
            sb.append(s.charAt(i));
            if (sb.length() == k){
                char[] chars = sb.toString().toCharArray();
                Arrays.sort(chars);
                String str = String.valueOf(chars);
                if (str.equals(p)) list.add(left);
                sb.deleteCharAt(0);
                left++;
            }
        }
        return list;
    }
}