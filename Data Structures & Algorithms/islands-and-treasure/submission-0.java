class Solution {
    public static class pair{
        int r;
        int c;
        int data;
        pair(int r, int c , int data){
            this.r=r;
            this.c=c;
            this.data=data;
        }
    }
    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean arr[][]=new boolean[n][m];
        Queue<pair> q = new LinkedList<>();
        for(int i =0 ; i < n ; i++){
            for(int j =0 ; j < m ; j++){
                if(grid[i][j]==0){
                    q.offer(new pair(i,j,0));
                    arr[i][j]=true;
                }
            }
        }

        int d[][]={{-1,0},{0,-1},{1,0},{0,1}};

        while(!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            int curr=q.poll().data;
            for(int i  =0 ; i < 4 ; i++){
                int row=r+d[i][0];
                int col=c+d[i][1];
                if(isValid(row,col,arr) ){
                    if(grid[row][col]==-1)continue;
                    grid[row][col]=Math.min(grid[row][col],curr+1);
                    q.offer(new pair(row,col,curr+1));
                    arr[row][col]=true;
                }
            }

        }


    }

    public static boolean isValid(int r , int c , boolean arr[][]){
        if( r < 0 || c < 0 || r >= arr.length || c >= arr[0].length)return false;
        if(arr[r][c])return false;
        return true;
    }
}
