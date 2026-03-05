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
    long secmin=Long.MAX_VALUE;
    int min;
    public int findSecondMinimumValue(TreeNode root) {
        min=root.val;
        MIN(root);
        return (secmin==Long.MAX_VALUE)?-1: (int) secmin;
    }
    public void MIN(TreeNode root){
        if(root==null) return;
        if(root.val>min && root.val<secmin){
            secmin=(long)root.val;
        }
        MIN(root.left);
        MIN(root.right);
    }
}