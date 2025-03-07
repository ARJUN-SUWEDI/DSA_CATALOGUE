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
        TreeNode root=new TreeNode();
        helper(root,nums,0,nums.length-1);
        return root;
    }
    public void helper(TreeNode r, int[] nums, int left,int right){
        int mid=left+(right-left)/2;
        r.val=nums[mid];
        if(left<=mid-1){
            r.left=new TreeNode();
            helper(r.left,nums,left,mid-1);
        }
        if(right>=mid+1){
            r.right=new TreeNode();
            helper(r.right,nums,mid+1,right);
        }
    }
}