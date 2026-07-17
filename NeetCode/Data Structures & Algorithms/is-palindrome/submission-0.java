class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < s.length() ;i++){
            char curr=s.charAt(i);
            if(curr <='z'&&curr >='a'){
                sb.append(curr);
            }else  if(curr <='Z'&&curr >='A'){
                char temp=(char)(curr-'A'+'a');
                sb.append(temp);
            }else  if(curr <='9'&&curr >='0'){
                sb.append(curr);
            }
        }

        String str=sb.toString();

        for(int i =0 ; i < str.length()/2 ;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))return false;
        }
        return true;


    }
}
