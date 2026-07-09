// Last updated: 7/9/2026, 9:12:44 AM
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);
        return res; 
    }
    static void inOrder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        inOrder(node.left, res);      
        res.add(node.val);           
        inOrder(node.right, res);     
    }
}
