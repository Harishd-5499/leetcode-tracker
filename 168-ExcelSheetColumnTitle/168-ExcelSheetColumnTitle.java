// Last updated: 7/9/2026, 9:12:33 AM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber%26;
            str.append((char)('A'+rem));
            columnNumber=columnNumber/26;
        }
        return str.reverse().toString();
    }
}