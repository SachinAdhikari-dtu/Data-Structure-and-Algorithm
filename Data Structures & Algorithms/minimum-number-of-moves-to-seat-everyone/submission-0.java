class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
     PriorityQueue<Integer> q = new PriorityQueue<>();
     PriorityQueue<Integer> q1 = new PriorityQueue<>();
     for(int i =0 ;  i < Math.max(seats.length,students.length) ; i++){
        if(i < seats.length) q.offer(seats[i]);
        if(i < students.length) q1.offer(students[i]);
     }   

     int ans=0;

     while(!q.isEmpty()){
        int n=q.poll();
        int m=q1.poll();
        ans+=Math.abs(m-n);
     }

     return ans;

    



    }
}