// Last updated: 7/9/2026, 9:13:22 AM
class Solution {
    public int maxArea(int[] h) {
        int i = 0, j = h.length - 1, m = 0;
        while (i < j)
            m = Math.max(m, (h[i] < h[j] ? h[i] * (j - i++) : h[j] * (j-- - i)));
        return m;
    }
}