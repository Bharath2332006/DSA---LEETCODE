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
    List<List<Integer>> arr=new ArrayList<>();
    boolean b=true;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return arr;
        zigzag(root,0);
        return arr;
    }
    public void zigzag(TreeNode root,int lvl){
        if(root==null) return;
        if(arr.size()==lvl){
            arr.add(new ArrayList<>());
        }
        if(lvl%2==0){
            arr.get(lvl).add(root.val);
        }else{
            arr.get(lvl).add(0,root.val);
        }
        zigzag(root.left,lvl+1);
        zigzag(root.right,lvl+1);
        
    }
}