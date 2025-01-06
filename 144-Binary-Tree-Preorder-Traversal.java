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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        pre(root,arr);
        return arr;
    }
    public void pre(TreeNode r,ArrayList<Integer> arr){
        if(r==null)return;
        arr.add(r.val);
        pre(r.left,arr);
        pre(r.right,arr);
    }
}