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
    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums,0,nums.length-1);
    }
    public TreeNode insert(int arr[], int l, int r){

        int m=(l+r)/2;

        TreeNode root=new TreeNode(arr[m]);
        if(l>r) return null;
        root.left=insert(arr,l,m-1);
        root.right=insert(arr, m+1,r);

        return root;
    }
}