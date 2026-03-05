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
    TreeNode xP=null;
    TreeNode yP=null;
    int xdepth=-1,ydepth=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        iscousins(root,x,y,0,null);
        return xdepth==ydepth && xP!=yP ? true:false;
    }
    public void iscousins(TreeNode root,int x,int y,int depth,TreeNode parent){
        if(root==null) return;
        if(root.val==x){
            xP=parent;
            xdepth=depth;
        }
        else if(root.val==y){
            yP=parent;
            ydepth=depth;
        }
        iscousins(root.left,x,y,depth+1,root);
        iscousins(root.right,x,y,depth+1,root);
        
    }
}