// Last updated: 7/9/2026, 9:12:16 AM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}