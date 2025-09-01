import java.util.*;

public class PrefixToPostfix {
    public static String convert(String exp) {
        Stack<String> stack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push(op1 + op2 + c);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String prefix = "+A*BC";
        System.out.println("Postfix: " + convert(prefix));
    }
}

