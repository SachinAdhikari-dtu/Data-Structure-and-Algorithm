class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        help(list,nums,0,new ArrayList<>());
        return list;

    }
    public static void help(List<List<Integer>> list , int nums[] , int i , List<Integer> l){
        if(i>=nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        help(list,nums,i+1,l);
        l.removeLast();    
        help(list,nums,i+1,l);

    }
}
