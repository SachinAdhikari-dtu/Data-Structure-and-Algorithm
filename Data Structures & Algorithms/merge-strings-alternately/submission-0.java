class Solution {
    public String mergeAlternately(String w, String v) {
        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        while(i < w.length() || j < v.length()    ){
            if(i < w.length()){
                sb.append(w.charAt(i++));
            }
            if(j < v.length()){
                sb.append(v.charAt(j++));
            }
        }
        return sb.toString();
    }
}