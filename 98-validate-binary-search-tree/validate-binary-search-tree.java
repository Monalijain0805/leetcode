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
    public boolean flag;
    private long max(TreeNode root){
        if(root== null) return Long.MIN_VALUE;
        long a = root.val;
        long b = max(root.left);
        if(b>=a) flag = false;
        long c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    private long min(TreeNode root){
        if(root== null) return Long.MAX_VALUE;
        long a = root.val;
        long b = min(root.left);
        long c = min(root.right);
        if(c<=a) flag = false;
        return Math.min(a,Math.min(b,c));
    }
    public boolean isValidBST(TreeNode root) {
        flag = true;
        max(root);
        min(root);
        return flag;
    }
}
   