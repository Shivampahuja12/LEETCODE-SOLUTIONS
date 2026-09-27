class Solution {
    public String reverseParentheses(String s) {

        while (s.contains("(")) {

            int open = -1;
            int close = -1;

            // Find the innermost '('
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    open = i;
                } else if (s.charAt(i) == ')') {
                    close = i;
                    break;
                }
            }

            // Reverse the substring inside parentheses
            StringBuilder temp = new StringBuilder(
                s.substring(open + 1, close)
            );

            temp.reverse();

            // Rebuild the string
            s = s.substring(0, open)
                + temp.toString()
                + s.substring(close + 1);
        }

        return s;
    }
}