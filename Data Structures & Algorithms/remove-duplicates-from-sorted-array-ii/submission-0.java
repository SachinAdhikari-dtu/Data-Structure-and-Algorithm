class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int index=0;
        for(Integer x:map.keySet()){
            int f=map.get(x);
            int curr=0;
            while(curr!=f && curr < 2){
                nums[index++]=x;
                curr++;
            }
        }
        return index;
    }
}