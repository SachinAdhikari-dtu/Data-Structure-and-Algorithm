class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i =0 ; i < nums.length ;i++){
        int key=target-nums[i];
        if(map.containsKey(key)){
            if(map.get(key)!=i){
                int arr[]={i,map.get(key)};
                Arrays.sort(arr);
                return arr;
            }
        }
        map.put(nums[i],i);


       }

       return new int[]{-1,-1};
    }
}
