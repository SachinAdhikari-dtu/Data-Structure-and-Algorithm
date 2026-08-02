class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0 ; i < stones.length ; i++){
            q.offer(stones[i]);
        }

        if(q.size()==2){
             int one=q.poll();
            int two=q.poll();

                return one-two;
        }

        while(true){
            if(q.size()==1)break;
            if(q.size()==0)return 0;
            int one=q.poll();
            int two=q.poll();

            if(two!=one){
                int ans=one -two;
                if(ans>0)q.offer(ans);
            }
            
            
                    }

                    return q.poll();
        
    }
}
