// Last updated: 7/9/2026, 9:12:39 AM
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (Character.isLetterOrDigit(i)) {
                newStr.append(Character.toLowerCase(i));
            }
        }
        int l = 0, r = newStr.length() - 1;
        while (l < r) {
            if (newStr.charAt(l++) != newStr.charAt(r--)) return false;
        }
        return true;
    }
}