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
    int maxPathDown(TreeNode root,int maxValue[]){
        if(root==null) return 0;
        int left = Math.max(0,maxPathDown(root.left,maxValue));
        int right = Math.max(0,maxPathDown(root.right,maxValue));
        maxValue[0] = Math.max(maxValue[0],left+right+root.val);
        return Math.max(left,right) + root.val;
    }
    public int maxPathSum(TreeNode root) {
        int val[] = new int[1];
        val[0] = Integer.MIN_VALUE;
        maxPathDown(root,val);
        return val[0];
    }
}
