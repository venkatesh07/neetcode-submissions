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
    int count = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
             maxPathSumHelper(root);
             return count;
    }
    private int maxPathSumHelper(TreeNode root){
        if(root == null) return 0;

        int lh = maxPathSumHelper(root.left);
        int rh = maxPathSumHelper(root.right);
        int left = Math.max(lh, 0);
        int right = Math.max(rh, 0);
        count = Math.max(count, root.val + left+right);

        return root.val + Math.max(left, right);
    }
}
