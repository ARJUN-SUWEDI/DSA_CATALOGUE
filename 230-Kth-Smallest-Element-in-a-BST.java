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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        Queue<TreeNode> nq=new LinkedList<>();
        nq.add(root);
        while(!nq.isEmpty()){
            TreeNode temp=nq.poll();

            q.add(temp.val);
            if (temp.left != null) nq.add(temp.left);
            if (temp.right != null) nq.add(temp.right);

        }
        int ans=0;
        while(k-->0){
            ans=q.poll();

        }
        return ans;
    }
}