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
    boolean b=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        pathsum(root,targetSum,0);
        return b;
    }
    public void pathsum(TreeNode root,int sum,int curr){
        if(root ==null) return;
        if(b==true) return ;
        curr+=root.val;
        if(root.left==null && root.right==null){
            if(sum==curr) {
                b=true;
                return;
            }
        }
        pathsum(root.left,sum,curr);
        pathsum(root.right,sum,curr);
    }
}