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
    int count = 0;
    public int goodNodes(TreeNode root) {

        if(root == null) return 0;
        goodNodesHelper(root, root.val);
        return count;
  
    }
    private int goodNodesHelper(TreeNode root, int maxNode){
        
        if(root == null) return 0;

        if(root.val >= maxNode){
            count++;
        }
        maxNode = Math.max(maxNode, root.val);

        goodNodesHelper(root.left, maxNode);
        goodNodesHelper(root.right, maxNode);

        return count;

    }
}
