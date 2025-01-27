/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        parents(root,map);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);
        Set<Integer> vis=new HashSet<>();
        vis.add(target.val);
        int curr=0;
        while(!q.isEmpty()){
            if(curr==k){
                break;
            }
            int s=q.size();
            while(s-->0){
                TreeNode temp=q.poll();
                if(temp.left!=null && !vis.contains(temp.left.val)){
                    q.offer(temp.left);
                    vis.add(temp.left.val);
                }
                if(temp.right!=null && !vis.contains(temp.right.val)){
                    q.offer(temp.right);
                    vis.add(temp.right.val);
                }
                if(map.get(temp)!=null && !vis.contains(map.get(temp).val)){
                    q.offer(map.get(temp));
                    vis.add(map.get(temp).val);
                }
            }
            curr++;
        }
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
    public static void parents(TreeNode root,HashMap<TreeNode,TreeNode> map){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        map.put(root,null);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp.left!=null){
                q.offer(temp.left);
                map.put(temp.left,temp);
            }
            if(temp.right!=null){
                q.offer(temp.right);
                map.put(temp.right,temp);
            }
        }
    }
}