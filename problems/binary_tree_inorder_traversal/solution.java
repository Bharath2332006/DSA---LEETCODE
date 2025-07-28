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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        recin(root,arr);
        return arr;

    }
    static void recin(TreeNode root,List<Integer> arr){
        if(root!=null){
            recin(root.left,arr);
            arr.add(root.val);
            recin(root.right,arr);
        }
    }
}