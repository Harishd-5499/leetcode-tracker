// Last updated: 7/9/2026, 9:12:22 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}