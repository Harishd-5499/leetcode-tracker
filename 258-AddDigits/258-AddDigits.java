// Last updated: 7/9/2026, 9:12:14 AM
class Solution {
    public int addDigits(int num) {
        while(num > 9) {
            int sum = 0;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}