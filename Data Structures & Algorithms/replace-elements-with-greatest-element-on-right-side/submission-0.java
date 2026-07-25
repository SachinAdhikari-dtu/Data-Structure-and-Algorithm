class Solution {
    public int[] replaceElements(int[] arr) {
            int index=arr.length-2;
            int n=arr.length-1;

            int p=arr[n];
            arr[n]=-1;
            while(index >=0){

                int curr=arr[index];
                arr[index]=p;
                p=Math.max(curr,p);
                index--;
            }
        
        

        
        
        return arr;
    }
}