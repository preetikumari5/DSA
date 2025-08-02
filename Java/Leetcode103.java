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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        boolean l_r = true; // left to right
        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                row.add(node.val); // Always add at the end
                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
            }
            if (!l_r) {
                Collections.reverse(row); // Reverse the row if right to left
            }
            res.add(row);
            l_r = !l_r; // Flip direction
        }
        return res;
    }
}