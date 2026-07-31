class Solution {
    public int numUniqueEmails(String[] arr) {
        HashSet<String> s = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i  =0 ; i < arr.length ; i++){
            String str=arr[i];
            boolean isSpotted=true;
            for(int j = 0 ; j < str.length() ; j++){
                char curr=str.charAt(j);
                if(curr=='@')isSpotted=false;
                if(curr=='.'){
                    if(isSpotted)  continue;
                    sb.append(curr);
                } else if(curr=='+'){
                    while( j < str.length() && str.charAt(j)!='@'){
                        j++;
                    }
                    j--;
                }else{
                    sb.append(curr);
                }
            }
            s.add(sb.toString());
            sb=new StringBuilder();
        }
        return s.size();
    }
}