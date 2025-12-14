class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < chars.length;) {
            int count = 1;
            int j = i + 1;
            while (j < chars.length && chars[i] == chars[j]) {
                count++;
                j++;
            }
            if (count == 1) {
                // chars[k++] = chars[i];
                sb.append(chars[i]);
            } else {
                // chars[k++] = chars[i];
                sb.append(chars[i]);
                sb.append(count);
                // chars[k++] = (char)(count + '0');
            }
            i = j;
        }

        for (int i=0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}