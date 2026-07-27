class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int arr[]=new int[26];
        for(int i = 0 ; i < allowed.length() ; i++){
            arr[allowed.charAt(i)-'a']++;
        }
        int ans=0;
        for(int i = 0 ; i < words.length ; i++){
            String str=words[i];
            int f=1;
            for(int j =0 ; j < str.length()  ; j++){
                int curr=str.charAt(j)-'a';
                if(arr[curr]==0){
                    f=0;
                    break;
                }
            }
            ans+=f;
        }
        return ans;
    }
}