/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return \\; // Return empty string for null root
        }
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp == null) {
                res.append(\# \);
            } else {
                res.append(temp.val).append(\ \);
                q.add(temp.left);
                q.add(temp.right);
            }
        }
        return res.toString().trim(); // Remove trailing space
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals(\\)) { // Use equals to check empty string
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        String[] values = data.split(\ \);
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        for (int i = 1; i < values.length; ++i) {
            TreeNode p = q.poll();
            if (!values[i].equals(\#\)) {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                p.left = left;
                q.add(left);
            }
            if (++i < values.length && !values[i].equals(\#\)) { // Ensure no out-of-bounds access
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                p.right = right;
                q.add(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
