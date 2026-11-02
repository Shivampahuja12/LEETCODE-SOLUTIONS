class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill);
        int i = 0;
        int j = n - 1;
        int skills = 0;
        int flag = skill[0] + skill[n - 1];
        long ans = 0;
        while (i < j) {
            skills = skill[i] + skill[j];
            if (skills != flag) return -1;
            ans += skill[i] * skill[j];
            i++;
            j--;
        }
        return ans;
    }
}