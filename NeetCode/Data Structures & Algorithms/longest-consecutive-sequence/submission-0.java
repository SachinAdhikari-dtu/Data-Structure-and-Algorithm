class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0 ; i < nums.length ;i++){
            map.put(nums[i],i);
        }

        int ans=0;
        for(int i =0 ; i < nums.length ;i++){
                int curr=1;
                int key=nums[i];
            while(true){
                if(map.containsKey(key+1)){
                    key++;
                }else break;
            curr++;
            }
            ans=Math.max(ans,curr);
        }
    return ans;
    }
}
