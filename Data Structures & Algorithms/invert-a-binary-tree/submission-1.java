
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode l=null;
        if(root.left!=null) l=invertTree(root.left);
        TreeNode r=null;
        if(root.right!=null) r=invertTree(root.right);
       root.left=r;
       root.right=l;
        return root;
        
    }
}
