class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i < arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(Integer x:map.keySet()){
            if(map.get(x)==x)ans=Math.max(ans,x);
        }
        return ans;
    }
}