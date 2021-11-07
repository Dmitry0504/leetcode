package problems.ValidParentheses_20;

import java.util.LinkedList;

class Solution {

    public static void main(String[] args) {
        String test1 = "()(){()}";
        String test2 = "(()}}";

        System.out.println(new Solution().isValid(test1));
        System.out.println(new Solution().isValid(test2));
    }

    public boolean isValid(String s) {
        LinkedList<Character> characters = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '(') characters.push(c);
            if (c == '{') characters.push(c);
            if (c == '[') characters.push(c);

            if (c == ')') {
                if (characters.isEmpty() || characters.peek() != '(') return false;
                else characters.pop();
            }
            if (c == '}') {
                if (characters.isEmpty() || characters.peek() != '{') return false;
                else characters.pop();
            }
            if (c == ']') {
                if (characters.isEmpty() || characters.peek() != '[') return false;
                else characters.pop();
            }

        }
        return characters.isEmpty();
    }
}
