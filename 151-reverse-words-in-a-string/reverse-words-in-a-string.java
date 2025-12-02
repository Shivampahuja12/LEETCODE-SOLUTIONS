class Solution {
    public String reverseWords(String s) {
        // StringBuilder sb = new StringBuilder(s);
        // int i = 0;
        // while (i < sb.length()) {
        //     int j = i;
        //     while (j < sb.length() && s.charAt(j) != ' ') {
        //         j++;
        //     }
        //     reverse(sb, i, j-1);
        //     i = j + 1;
        // }
        // return sb.toString();

        s = s.trim();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i=words.length-1; i>=0; i--){

            sb.append(words[i]);
            if (i == 0) break;
            else sb.append(" ");
        }

        String str = sb.toString().replaceAll("\\s+", " ");
        return str;
    }
}