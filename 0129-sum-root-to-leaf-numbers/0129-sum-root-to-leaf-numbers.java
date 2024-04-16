/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int ans = 0;
private int calculateSum(TreeNode node, int sum) {
    if (node == null) return 0; // If node is null, return 0.
    if (node.left == null && node.right == null) {
        return sum * 10 + node.val; // Return the sum of current path.
    }
    sum = sum * 10 + node.val;
    int leftSum = calculateSum(node.left, sum); // Recursively calculate sum for left subtree.
    int rightSum = calculateSum(node.right, sum); // Recursively calculate sum for right subtree.
    return leftSum + rightSum; // Return the sum of both subtrees.
}
public int sumNumbers(TreeNode root) {
    int ans = 0;
    ans = calculateSum(root, 0);
    return ans;
}
}