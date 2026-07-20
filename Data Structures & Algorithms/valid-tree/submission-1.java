class Solution {

    public static class pair{
        int curr;
        int data;

        pair(int curr , int data){
            this.data=data;
            this.curr=curr;
        }
    }


     public boolean bfs(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0 ; i < n ; i++){
            list.add(new ArrayList<>());
        }
        for(int i =0 ; i < edges.length ; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }

        
        boolean arr[]=new boolean[n];
        Queue<pair> q= new LinkedList<>();
        int step=0;
        for(int i =0 ; i < n ; i++){
            if(arr[i])continue;
            q.add(new pair(i,-1));
            arr[i]=true;
            step++;
            while(!q.isEmpty()){
                int parent=q.peek().data;
                int curr=q.poll().curr;

                for(Integer x: list.get(curr)){
                    if(!arr[x]){
                        arr[x]=true;
                        q.offer(new pair(x,curr));
                    }else if (arr[x] && x !=parent)return false;
                }
            }
        }

        return step==1;

    }

    public boolean validTree(int n, int[][] edges) {
        return bfs(n,edges);
    }
}
