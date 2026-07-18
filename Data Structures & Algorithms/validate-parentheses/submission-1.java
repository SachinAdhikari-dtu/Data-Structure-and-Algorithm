class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '[' || curr == '{' || curr == '(') {
                s.push(curr);
            } else {
                if(s.isEmpty())return false;
                if (curr == ']' && s.peek() == '[') {
                    s.pop();
                } else if (curr == '}' && s.peek() == '{') {
                    s.pop();
                } else if (curr == ')' && s.peek() == '(') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }
}
