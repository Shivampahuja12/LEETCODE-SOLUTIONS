class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder();
        int sIdx = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                sIdx = i;
            } else if (ch == ')' && sIdx != -1) {
                String cut = s.substring(sIdx + 1, i);
                boolean flag = false;
                // replaces the inner for loop
                if (map.containsKey(cut)) {
                    sb.append(map.get(cut));
                } else {
                    sb.append("?");
                }
                sIdx = -1;
            } else if (sIdx == -1) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}