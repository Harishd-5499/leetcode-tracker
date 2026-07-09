// Last updated: 7/9/2026, 9:12:30 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++)
            ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
        return ans;
    }
}