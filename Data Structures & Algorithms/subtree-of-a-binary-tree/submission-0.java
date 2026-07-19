
class Solution {  

        public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if(p==null||q==null)return false;
        if(p.val!=q.val)return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void helper(TreeNode root , TreeNode key , ArrayList<TreeNode> list){
        if(root==null)return;
        if(root.val==key.val)list.add(root);
        helper(root.left,key,list);
        helper(root.right,key,list);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        ArrayList<TreeNode> list = new ArrayList<>();
        helper(root,subRoot,list);
        if(list.size()==0)return false;
        for(int i =0  ; i < list.size() ;i++){
            if(isSameTree(list.get(i),subRoot))return true;
        }
        return false;
    }
}
