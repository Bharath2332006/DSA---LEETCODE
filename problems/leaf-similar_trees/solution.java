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
    Queue<Integer> q=new LinkedList<>();
    boolean b=true;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        isSimilar1(root1);
        isSimilar2(root2);
        return (b &&q.isEmpty());
    }
    public void isSimilar1(TreeNode root1){
        if(root1==null) return;
        if(root1.left==null && root1.right==null) q.add(root1.val);
        isSimilar1(root1.left);
        isSimilar1(root1.right);
    }
    public void isSimilar2(TreeNode root2){
        if(root2==null) return;
        if(root2.left==null && root2.right==null){
            if(q.isEmpty() || root2.val!=q.peek()){
                b=false;
                return;
            }else q.poll();
        }
        isSimilar2(root2.left);
        isSimilar2(root2.right);
    }
    
}