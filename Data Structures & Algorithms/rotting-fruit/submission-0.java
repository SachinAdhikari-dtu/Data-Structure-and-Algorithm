class Solution {
    public static class pair{
        int r;
        int c ;
        int data;
        pair(int r , int c , int data){
            this.r=r;
            this.c=c;
            this.data=data;
        }
    }

    public static boolean isValid(int r  , int c , boolean arr[][]){
        if(r >=arr.length || r < 0 || c >=arr[0].length  || c < 0)return false;
        if(arr[r][c])return false;
        return true;
    }

    public int orangesRotting(int[][] grid) {

        boolean arr[][]=new boolean[grid.length][grid[0].length];
        Queue<pair> q= new LinkedList<>();
        int one=0;

        for(int i = 0 ; i < arr.length ;i++){
            for(int j =  0 ; j < arr[0].length ; j++){

                if(grid[i][j]==1)one++;

                if(grid[i][j]==2){
                    q.offer(new pair(i,j,0));
                    arr[i][j]=true;
                }
            }
        }

    int cone=0;
    int ans=0;
    int d[][]={{-1,0},{0,1},{1,0},{0,-1}};

    while(!q.isEmpty()){
        int r=q.peek().r;
        int c=q.peek().c;
        int data=q.poll().data;

        for(int i  =0 ; i < 4 ; i++){
            int row=r+d[i][0];
            int col=c+d[i][1];

            if(isValid(row,col,arr)){
                if(grid[row][col]==0)continue;
                cone++;
               arr[row][col]=true;
             q.offer(new pair(row,col,data+1));
            ans=Math.max(ans,data+1);
        }
        }
    }

    if(one!=cone)return -1;

    return ans;



    }
}
