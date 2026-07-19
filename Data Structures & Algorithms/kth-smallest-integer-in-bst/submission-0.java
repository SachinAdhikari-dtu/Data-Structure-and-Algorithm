
class Solution {
    public static int helper(TreeNode root , int k , ArrayList<Integer> l){
        if(l.size()==k)return l.get(l.size()-1);
        if(root==null)return 0;
        int le =helper(root.left,k,l);
        l.add(root.val);
        int r=helper(root.right,k,l);
        return Math.max(le,r);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)return 0;
        if(k==0)return root.val;
        return helper(root,k,new ArrayList<>());

    }
}
