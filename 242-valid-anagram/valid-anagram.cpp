class Solution {
public:
    bool isAnagram(string s, string t) {
        sort(s.begin(), s.end());
        // cout << s << endl;
        sort(t.begin(), t.end());
        // cout << t << endl;
        // cout << s.size() << endl;
        // cout << t.size() << endl;
        if (s.size()!=t.size()) return false;
        for (int i=0; i<s.size(); i++){
            if (s[i] != t[i]) return false;
        }
        return true;
    }
};