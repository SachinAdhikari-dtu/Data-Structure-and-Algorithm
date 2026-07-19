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
    public static int[] helper(TreeNode root){
        if(root==null)return new int[]{-1,1};
        int l[]=helper(root.left);
        int r[]=helper(root.right);
        if(Math.abs(l[0]-r[0]) > 1){
            return new int[]{Math.max(l[0],r[0])+1,0};
        }
        int h=Math.max(l[0],r[0])+1;
        int h2=1;
        if(l[1]==0||r[1]==0)h2=0;
        return new int[]{h,h2};
        
    }
    public boolean isBalanced(TreeNode root) {
       int arr[]=helper(root);
       return arr[1]==1;
        
    }
}
