class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            String curr = arr[i];
            
            if (curr.equals("+")) {
                int a = s.pop();
                int b = s.peek();
                int result = a + b;
                s.push(a);  // Push back the first value
                s.push(result);
                sum += result;
            } 
            else if (curr.equals("D")) {
                int a = s.peek();
                int result = a * 2;
                s.push(result);
                sum += result;
            } 
            else if (curr.equals("C")) {
                sum -= s.pop();
            } 
            else {
                // Handle both positive and negative integers
                int num = Integer.parseInt(curr);
                s.push(num);
                sum += num;
            }
        }
        return sum;
    }
}