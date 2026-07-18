class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ;i++){

            if(i > 0  && nums[i-1]==nums[i])continue;

            int s=i+1;
            int e=nums.length-1;
            while(s<e){
                int sum=nums[i]+nums[s]+nums[e];
                if(sum==0){
                    List<Integer> l =new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[s]);
                    l.add(nums[e]);
                    set.add(l);
                    s++;
                    e--;
                }else if(sum > 0 ){
                    e--;
                }else{
                    s++;
                }
            }

        }
        return new ArrayList<>(set);
    }
}
