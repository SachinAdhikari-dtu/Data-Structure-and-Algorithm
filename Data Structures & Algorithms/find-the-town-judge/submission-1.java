class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashMap<Integer,Integer> map2= new HashMap<>();

        for(int i =0 ; i < trust.length ; i++){
            int u =trust[i][0];
            int v =trust[i][1];
            map.put(u,map.getOrDefault(u,0)+1);
            map2.put(v,map2.getOrDefault(v,0)+1);
        }

        for(int i =1 ; i <= n ; i++){
            if(map.getOrDefault(i,0)==0 && (map2.getOrDefault(i,0)>=n-1))return i;
        }

        return -1;
    }
}