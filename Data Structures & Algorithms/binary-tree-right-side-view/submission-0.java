

class Solution {


    public List<Integer> rightSideView(TreeNode root) {
             Queue<TreeNode> q= new LinkedList<>();   
        List<Integer> list = new ArrayList<>();
     if(root==null)return list;
     q.offer(root);
    while(!q.isEmpty()){

        int length=q.size();
        for(int i =0 ; i < length ;i++){
            TreeNode curr=q.poll();
            if(i==length-1)list.add(curr.val);
            if(curr.left!=null)q.offer(curr.left);
            if(curr.right!=null)q.offer(curr.right);
        }

    }return list;

    
    }
}
