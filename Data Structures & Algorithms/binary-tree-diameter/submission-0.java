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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null) return 0;

        diameterOfBinaryTreeHelper(root);
        return max;
    }
    private int diameterOfBinaryTreeHelper(TreeNode root){
        if(root == null) return 0;

        int lh = diameterOfBinaryTreeHelper(root.left);
        int rh = diameterOfBinaryTreeHelper(root.right);
        max = Math.max(max, lh+rh);
        return 1 + Math.max(lh, rh);
    }
}
