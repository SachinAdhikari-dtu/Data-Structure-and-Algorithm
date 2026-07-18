class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length ;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[][]=new int[map.size()][2];
        int index=0;
        for(Integer x: map.keySet()){
            arr[index][0]=x;
            arr[index++][1]=map.get(x);
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
        int ans[]=new int[k];
        for(int i =0 ; i < ans.length ;i++){
            ans[i]=arr[arr.length-1-i][0];
        }return ans;
    }
}
