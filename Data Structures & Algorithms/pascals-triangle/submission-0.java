class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        l.add(list);
        for(int i =0; i < numRows-1 ; i++){
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        for(int j =0 ; j < l.get(l.size()-1).size()-1 ; j++ ){
    curr.add(l.get(l.size()-1).get(j) + l.get(l.size()-1).get(j+1));

        }
        curr.add(1);
        l.add(curr);
        } return l;
    }
   
}