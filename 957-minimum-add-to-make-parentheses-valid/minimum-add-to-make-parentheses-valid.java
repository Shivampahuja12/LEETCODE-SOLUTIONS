class Solution {
    public int minAddToMakeValid(String s) {
        /* int op = 0;
        int cl = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                op++;
            else if (s.charAt(i) == ')')
                cl++;
        }
        
        if (op > cl)
            return op - cl;
        else if (op == cl)
            return 0;
        else
            return cl - op; */

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            } else {
                st.push(ch);
            }
        }
        return st.size();

    }
}