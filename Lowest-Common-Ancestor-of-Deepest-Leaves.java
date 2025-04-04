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
    int deepestCount=0;
    int deepestLevel=0;
    TreeNode lcaNode=null;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        countDeepestLeaves(root,0);
        lca(root, 0);
        return lcaNode;
    }

    public int lca(TreeNode root, int currentLevel){
        if (root==null) return 0;
        int count = lca(root.left, currentLevel+1) + lca(root.right, currentLevel+1);
        if (currentLevel==deepestLevel) count+=1;
        if (count == deepestCount && lcaNode==null){
            lcaNode=root;
        }
        return count;
    }
    

    public void countDeepestLeaves(TreeNode root, int level){
        if (root!=null){
            if (root.left==null && root.right==null){
                if (level>deepestLevel){
                    deepestLevel=level;
                    deepestCount=1;
                } else if (level==deepestLevel){
                    deepestCount++;
                }
            } else {
                countDeepestLeaves(root.left, level+1);
                countDeepestLeaves(root.right, level+1);
            }
        }
    }
}