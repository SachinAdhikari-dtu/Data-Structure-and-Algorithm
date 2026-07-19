

class Solution {
    static int ans=0;
    public static int helper(TreeNode root){
        if(root==null)return 0;
        int l=helper(root.left);
        int r=helper(root.right);
        int curr=l+r+1;
        ans=Math.max(ans,curr);
        return Math.max(l,r)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        ans=0;
        helper(root);
        return ans-1;
    }
}
