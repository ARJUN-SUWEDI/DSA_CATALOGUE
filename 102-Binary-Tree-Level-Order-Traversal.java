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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null) return ans;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            ArrayList<Integer> sub=new ArrayList<>();
            for(int i=0;i<s;++i){
                TreeNode temp=q.remove();
                sub.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            ans.add(sub);
        }
        return ans;
    }
}