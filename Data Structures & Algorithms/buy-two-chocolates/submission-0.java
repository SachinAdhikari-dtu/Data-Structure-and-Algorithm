class Solution {
    public int buyChoco(int[] arr, int money) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0; i < arr.length ; i++){
            if(q.size() <2){
                q.offer(arr[i]);
            }else if(q.size()==2){
                if(q.peek()> arr[i]){
                    q.poll();
                    q.offer(arr[i]);
                }
            }
        }

        int ans=q.poll()+q.poll();
        if(ans > money)return money;
        return money - ans;

    }
}