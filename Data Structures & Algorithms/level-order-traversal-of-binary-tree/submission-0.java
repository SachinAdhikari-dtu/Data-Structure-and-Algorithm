

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

     Queue<TreeNode> q= new LinkedList<>();   
     List<List<Integer>> list = new ArrayList<>();
     if(root==null)return list;
     q.offer(root);
    while(!q.isEmpty()){

        int length=q.size();
        List<Integer> l = new ArrayList<>();
        for(int i =0 ; i < length ;i++){
            TreeNode curr=q.poll();
            l.add(curr.val);
            if(curr.left!=null)q.offer(curr.left);
            if(curr.right!=null)q.offer(curr.right);
        }
        list.add(l);

    }return list;

    }
}
