// Last updated: 7/9/2026, 9:13:35 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        if (totalLen % 2 == 1) {
            return findKth(nums1, 0, nums2, 0, totalLen / 2 + 1);
        } else {
            double left = findKth(nums1, 0, nums2, 0, totalLen / 2);
            double right = findKth(nums1, 0, nums2, 0, totalLen / 2 + 1);
            return (left + right) / 2.0;
        }
    }
    private double findKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        if (start1 >= nums1.length) {
            return nums2[start2 + k - 1];
        }
        if (start2 >= nums2.length) {
            return nums1[start1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        int midIndex1 = start1 + k / 2 - 1;
        int midIndex2 = start2 + k / 2 - 1;
        int midVal1 = midIndex1 < nums1.length ? nums1[midIndex1] : Integer.MAX_VALUE;
        int midVal2 = midIndex2 < nums2.length ? nums2[midIndex2] : Integer.MAX_VALUE;
        if (midVal1 < midVal2) {
            return findKth(nums1, midIndex1 + 1, nums2, start2, k - k / 2);
        } else {
            return findKth(nums1, start1, nums2, midIndex2 + 1, k - k / 2);
        }
    }
}
