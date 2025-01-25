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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int parent =0;
        int child=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;++i){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                    if(temp.left.val==x || temp.left.val==y){
                        parent++;
                        child++;
                    }
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    if(temp.right.val==x || temp.right.val==y){
                        parent++;
                        child++;
                    }
                }
                if(parent==2)return false;
                if(child==2)return true;
                parent=0;
            }
            if(child==1)return false;
        }
        return false;
    }
}