class Solution {
    public int[] findOrder(int n, int[][] p) {
        

     HashMap<Integer,Integer> map = new HashMap<>();
     ArrayList<ArrayList<Integer>> lsit = new ArrayList<>();
     for(int i =0 ; i < n ; i++){
        lsit.add(new ArrayList<>());
        map.put(i,0);
     }


        for(int i =0 ; i < p.length ; i++){
            int u = p[i][0];
            int v=p[i][1];
            map.put(u,map.getOrDefault(u,0)+1);
            lsit.get(v).add(u);
        }

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        for(Integer x: map.keySet()){
            if(map.get(x)==0){
                q.offer(x);
            }
        }

        if(q.isEmpty())return new int[]{};

        while(!q.isEmpty()){
            int curr=q.poll();
            list.add(curr);
            for(Integer x:lsit.get(curr) ){
                map.put(x,map.get(x)-1);
                if(map.get(x)==0){
                    q.offer(x);
                }
            }
        }

        if(n!=list.size())return new int[]{};

        int ans[]=new int[list.size()];


        for(int i =0 ; i < ans.length ; i++){
            ans[i]=list.get(i);
        }
        return ans;

    }
}
