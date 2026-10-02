class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(0, n, "", list);
        return list;
    }

    public void generate(int i, int n, String s, List<String> list) {
        if (i == 2 * n) {
            if (isValid(s)) {
                list.add(s);
            }
            return;
        }
        generate(i + 1, n, s + "(", list);
        generate(i + 1, n, s + ")", list);
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) return false;
            }
        }
        return st.isEmpty();
    }
}