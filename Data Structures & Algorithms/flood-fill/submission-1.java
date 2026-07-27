class Solution {
    public static void help(int r , int c , int arr[][] ,boolean visited[][] , int color , int d[][] ,int curr){
        
        visited[r][c]=true;
        arr[r][c]=color;
        
        for(int i =0 ; i < d.length ;i++){
            int row=r+d[i][0];
            int col=c+d[i][1];
            if(isValid(row,col,visited)  && arr[row][col]==curr)help(row,col,arr,visited,color,d,curr);
        }
        

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int curr=image[sr][sc];       
        boolean visited[][]=new boolean[image.length][image[0].length];
        help(sr,sc,image,visited,color,new int[][]{{-1,0},{0,1},{1,0},{0,-1}} , curr);
        return image;
    }


    public static boolean isValid(int r, int c , boolean arr[][]){
        if(r < 0 || c < 0 || r >=arr.length || c >= arr[0].length || arr[r][c] )return false;
        return true;
    }
}