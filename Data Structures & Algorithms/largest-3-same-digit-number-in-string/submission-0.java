class Solution {
    public String largestGoodInteger(String num) {
        // int arr[]=new int[10];

        // for(int i = 0 ; i < num.length() ; i++){
        //     arr[num.charAt(i)-'0']++;
        // }

        // int ans=-1;
        // for(int i =0; i < arr.length ; i++){
        //     if(arr[i] >=3 )ans=Math.max(ans,i);
        // }
       
        // return str;
        char arr[]=num.toCharArray();
        int ans=-1;
        for(int i =0 ; i < arr.length ; i++ ){
            int step=1;
            while(i < arr.length-1 && arr[i]==arr[i+1]){
                step++;
                i++;
            }
            if(step >=3)ans=Math.max(ans,num.charAt(i)-'0');
        }

         if(ans==-1)return "";
        String str=""+ans+ans+ans;
    return str;

    }
}