import java.util.*;

public class PostfixToPrefix {
    public static String convert(String exp) {
        Stack<String> stack = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                stack.push(c + op1 + op2);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String postfix = "ABC*+";
        System.out.println("Prefix: " + convert(postfix));
    }
}
