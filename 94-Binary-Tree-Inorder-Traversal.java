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
    private void helper(TreeNode root, List<Integer> fans)
    {
        if(root==null) return;
        
        helper(root.left, fans);
        fans.add(root.val);
        helper(root.right, fans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> answer=new ArrayList<>();
        Stack<TreeNode> st= new Stack<>();
        TreeNode temp=root;
        while (temp != null || !st.isEmpty()) {
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                temp=st.pop();
                answer.add(temp.val);
                temp=temp.right;
            }
        }

        return answer;
    }
}
