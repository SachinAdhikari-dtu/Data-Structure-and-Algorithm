class Solution {
    
    public static void helper(char grid[][] , boolean arr[][]  , int r , int c , int d[][]){
        arr[r][c]=true;
        for(int i =0 ; i < 4 ; i++ ){
            int row= r+d[i][0];
            int col=c+d[i][1];
            if(isValid(row,col,arr) ){
                if(grid[row][col]=='0')continue;
             helper(grid,arr,row,col,d);
            }
        }
    }
    public static boolean isValid(int r  , int c , boolean arr[][]){
        if(r >=arr.length || r < 0 || c >=arr[0].length  || c < 0)return false;
        if(arr[r][c])return false;
        return true;
    }
    public int numIslands(char[][] grid) {
        boolean arr[][]=new boolean[grid.length][grid[0].length];
        int ans=0;
        int d[][]={{-1,0},{1,0},{0,1},{0,-1}};
        for(int i =0 ; i < arr.length ; i++){
            for(int j = 0 ;  j < arr[0].length ; j++){
                if(!arr[i][j] && grid[i][j]=='1'){
                    ans++;
                    helper(grid,arr,i,j,d);
                }
            }
        }

        return ans;
    }
}
