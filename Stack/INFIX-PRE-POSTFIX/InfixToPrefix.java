import java.util.*;

public class InfixToPrefix {
    private static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        if (c == '^') return 3;
        return -1;
    }

    public static String convert(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String reversed = new StringBuilder(exp).reverse().toString();
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == ')') {
                stack.push(c);
            } else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) > precedence(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "A+(B*C)";
        System.out.println("Prefix: " + convert(infix));
    }
}

