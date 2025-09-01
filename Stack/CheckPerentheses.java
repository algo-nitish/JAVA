package Stack;

import java.util.Stack;

public class CheckPerentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String st = "({[]})";
        System.out.println(isValid(st));  // Output: true
    }
}
