class Solution {
    public int countComponents(int n, int[][] edges) {
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

        int step=0;
        boolean arr[]=new boolean[n];
    Queue<Integer> q= new LinkedList<>();
        for(int i =0 ; i < n ; i++){
            if(arr[i])continue;
            q.add(i);
            arr[i]=true;
            step++;
            while(!q.isEmpty()){
                int curr=q.poll();
                for(Integer x: list.get(curr)){
                    if(!arr[x]){
                        arr[x]=true;
                        q.offer(x);
                    }
                }
            }
        }

        return step;

    }
}
