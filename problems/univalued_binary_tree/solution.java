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
    boolean b=true;
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        valid(root,val);
        return b;
    }
    public void valid(TreeNode root, int val){
        if(root ==null )return;
        if(b){
            if( root.val!=val) b=false;
            valid(root.left,val);
            valid(root.right,val);
        }
    }
}