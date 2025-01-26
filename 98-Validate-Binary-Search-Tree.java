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
    public boolean isValidBST(TreeNode root) {
        return helper(root, null,null);
    }
    public static boolean helper(TreeNode node,Integer l, Integer r){
        if(node==null){
            return true;
        }
        if(l!=null && l>=node.val){
            return false;
        }
        if(r!=null && r<=node.val){
            return false;
        }

        boolean lt=helper(node.left,l,node.val);
        boolean rt=helper(node.right,node.val,r);

        return lt && rt;
    }
}