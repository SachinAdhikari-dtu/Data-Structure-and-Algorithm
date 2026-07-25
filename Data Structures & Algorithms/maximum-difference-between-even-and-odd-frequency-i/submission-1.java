class Solution {
    public int maxDifference(String s) {
        int oddMax=0;
        int evenMax=0;
        int even=Integer.MAX_VALUE;
        int odd=Integer.MAX_VALUE;


        HashMap<Integer,Integer> map=new HashMap<>();

       for(int i =0  ;i < s.length() ;i++){
        int curr=s.charAt(i)-'a';
        map.put(curr,map.getOrDefault(curr,0)+1);
       } 

       for(Integer x:map.keySet()){
        

        if(map.get(x)%2==0){
            even=Math.min(even,map.get(x));
            evenMax=Math.max(evenMax,map.get(x));
        }else{
            odd=Math.min(odd,map.get(x));
            oddMax=Math.max(oddMax,map.get(x));
        }


       }

       

       return Math.max((oddMax-even),(odd-evenMax));
        

    }
}