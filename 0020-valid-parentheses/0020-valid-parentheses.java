class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                res.push(c);
            } else if (c == ')') {
                if (!res.isEmpty() && res.peek() == '(') {
                    res.pop();
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (!res.isEmpty() && res.peek() == '{') {
                    res.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (!res.isEmpty() && res.peek() == '[') {
                    res.pop();
                } else {
                    return false;
                }
            }
        }
        return res.isEmpty();
    }
}