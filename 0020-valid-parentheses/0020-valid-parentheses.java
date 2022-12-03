class Solution {
    public boolean isValid(String s) {
        Deque<Character> charStack = new ArrayDeque<>();
        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put('{', '}');
        parentheses.put('(', ')');
        parentheses.put('[', ']');
        boolean res = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                charStack.push(s.charAt(i));
            }
            else if (charStack.size() == 0) {
                return false;
            }
            else if (parentheses.get(charStack.pop()) == s.charAt(i)) {
                res = true;
            } else {
                return false;
            }
        }
        if (charStack.size() != 0) {
            res = false;
        }
        return res;
    }
}