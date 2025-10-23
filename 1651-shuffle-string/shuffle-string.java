class Solution {
    public String restoreString(String s, int[] indices) {
        // Arrays.sort(indices);

        StringBuilder sb = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        
        for (int i=0; i<s.length(); i++){
            for (int j=0; j<s.length(); j++){
                if (i == indices[j]){
                    result.append(s.charAt(j));
                    break;
                }
            }
        }

        return result.toString();
    }
}