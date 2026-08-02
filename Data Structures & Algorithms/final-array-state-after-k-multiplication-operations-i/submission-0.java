class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> q = new PriorityQueue<>(            (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

    for(int i = 0  ; i < nums.length ;  i++){
        q.offer(new int[]{nums[i],i});
    }

    while( k-- >0){
        int arr[]=q.poll();
        int val=arr[0]*multiplier;
        q.offer(new int[]{val,arr[1]});
    }

    while(!q.isEmpty()){
        int arr[]=q.poll();
        nums[arr[1]]=arr[0];
    }
    return nums;

    }
}