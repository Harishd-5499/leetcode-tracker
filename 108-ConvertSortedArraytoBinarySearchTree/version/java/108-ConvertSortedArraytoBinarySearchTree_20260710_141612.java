// Last updated: 7/10/2026, 2:16:12 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16// Definition for a binary tree node.
17class Solution {
18    public TreeNode sortedArrayToBST(int[] nums) {
19        return insert(nums, 0, nums.length);
20    }
21    TreeNode insert(int[] nums, int start, int end) {
22        if (start == end) return null;
23        int mid = (start + end) / 2;
24        TreeNode node = new TreeNode(nums[mid]);
25        node.left = insert(nums, start, mid);
26        node.right = insert(nums, mid + 1, end);
27        return node;
28    }
29}