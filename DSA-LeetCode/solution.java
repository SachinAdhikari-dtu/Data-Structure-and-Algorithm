import java.util.ArrayList;

public class solution {


  
  static  void getStair(int n , String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(n<0)return;
        int arr[]={1,2,3};
        for (int i = 0; i < arr.length; i++) {
            getStair(n-arr[i], ans+"  "+arr[i]);
        }
    }




    public static ArrayList<String> helper(int sr , int se , int er , int ec){

                if(sr==er&&se==ec){
                   ArrayList<String> l= new ArrayList<>();l.add("");
                   return l;
                }

                ArrayList<String> l=new ArrayList<>();
                if(sr<er){
                   l =helper(sr+1, se, er, ec);
                  for (int i = 0; i < l.size(); i++) {
                    l.set(i,l.get(i)+" H ");
                  }
                    
                   }
                

                ArrayList<String> l0=new ArrayList<>();

                 if(se < ec){
                    l0 =helper(sr, se+1, er, ec);
                  for (int i = 0; i < l0.size(); i++) {
                    l0.set(i,l0.get(i)+" V ");
                  }
                }
                l.addAll(l0);
                return l;


    }




        public static void helper2(int sr , int se , int er , int ec,String ans ){
                 if(sr==er&&se==ec){
                    System.out.println(ans);
                    return;
                }

                if(sr <  er)helper2(sr+1, se, er, ec, ans+" H ");
                if(se <  ec)helper2(sr, se+1, er, ec, ans+" V ");



        }




          public static void helper3(int sr , int se , int er , int ec,String ans ,ArrayList<String> l){
                 if(sr==er&&se==ec){
                   l.add(ans);
                    return;
                }

                if(sr <  er)helper3(sr+1, se, er, ec, ans+" H ",l);
                if(se <  ec)helper3(sr, se+1, er, ec, ans+" V ",l);



        }





        public static void helper4(int sr , int se , int er , int ec,String ans ,ArrayList<String> l){
                 if(sr==er&&se==ec){
                   l.add(ans);
                    return;
                }


                if(sr <  er)helper4(sr+1, se, er, ec, ans+" H1 ",l);
                if(sr+1 <  er)helper4(sr+1+1, se, er, ec, ans+" H2 ",l);
                if(sr+2 <  er)helper4(sr+1+2, se, er, ec, ans+" H3 ",l);
                if(se <  ec)helper4(sr, se+1, er, ec, ans+" V1 ",l);
                if(se+1 <  ec)helper4(sr, se+1+1, er, ec, ans+" V2 ",l);
                if(se+2 <  ec)helper4(sr, se+1+1, er, ec, ans+" V3 ",l);

                
                 if(sr <  er&&se <  ec)helper4(sr+1, se+1, er, ec, ans+" D1 ",l);
                if(sr+1 <  er&&se +1<  ec)helper4(sr+1+1, se+2, er, ec, ans+" D2 ",l);
                if(sr+2 <  er&&se +2<  ec)helper4(sr+1+2, se+3, er, ec, ans+" D3 ",l);



        }





        public static void permutation(String ans , String str){
          if(str.isEmpty()){
            System.out.println(ans);
            return;
          }

          for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            permutation(ans+curr, str.substring(0,i)+str.substring(i+1,str.length()));
          }


        }




        public static void permutation(ArrayList<String> l , String ans , String str){
          if(str.isEmpty()){
            l.add(ans);
            return;
          }

          for (int i = 0; i < str.length(); i++) {

            char curr=str.charAt(i);
            String left = str.substring(0,i);
            String right=str.substring(i+1,str.length());

            permutation(l,ans+curr, left+right);
          }


        }




        public static void permutationOfArray(int arr[] , ArrayList<Integer> l , ArrayList<ArrayList<Integer>> list , int i){

          if(i==arr.length){
            list.add(new ArrayList<>(l));
            return;
          }


         
            l.add(arr[i]);
            permutationOfArray(arr, l, list, i+1);
            l.removeLast();
            permutationOfArray(arr, l, list, i+1);
        }





       public static void floodFill(String ans, boolean[][] visited, int[][] arr, int r, int c) {
    // Base case: reached destination
    if (r == arr.length - 1 && c == arr[0].length - 1) {
        System.out.println(ans);
        return;
    }

    // Out of bounds or blocked or already visited
    if (r < 0 || c < 0 || r >= arr.length || c >= arr[0].length || arr[r][c] == 1 || visited[r][c]) {
        return;
    }

    // Mark current cell
    visited[r][c] = true;

    // Explore all directions
    floodFill(ans + "R ", visited, arr, r, c + 1); // right
    floodFill(ans + "D ", visited, arr, r + 1, c); // down
    floodFill(ans + "L ", visited, arr, r, c - 1); // left
    floodFill(ans + "U ", visited, arr, r - 1, c); // up

    // Backtrack
    visited[r][c] = false;
}





    public static void targetSum(ArrayList<ArrayList<Integer>> list , ArrayList<Integer> l , int arr[] , int i , int t){
      if(i > arr.length)return;
      if(t==0){
        list.add(new ArrayList<>(l));
        return;
      }
      if(t<0)return;

      for (int j = i; j < arr.length; j++) {
        l.add(arr[j]);
        targetSum(list, l, arr, j+1, t-arr[j]);
        l.removeLast();
      }


    }




    public static void main(String[] args) {



    // int arr[][]={{0,1,0,0,0,0,0},{0,1,0,1,1,1,0,},{0,0,0,0,0,0,0},{1,0,1,1,0,1,1},{1,0,1,1,0,1,1},{1,0,0,0,0,0,0,0}};
    // boolean visited[][]=new boolean[arr.length][arr[0].length];
    // floodFill("", visited, arr, 0, 0);


        // TAREGT SUM \\\
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        targetSum(list, new ArrayList<>(), new int[]{10,20,30,40,50}, 0, 60);
        System.out.println(list);






    }
}








