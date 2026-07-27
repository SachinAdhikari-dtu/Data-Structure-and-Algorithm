class Solution {
    public static int help(int n ){
        if(n==1)return 0;
        if(n==2)return 1;
        return ((n-1)*n)/2;
    }
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        for(int  i=0 ;i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Integer x : map.keySet()){
            ans+=help(map.get(x));
        }
        return ans;

    }
}