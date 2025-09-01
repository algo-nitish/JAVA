import java.util.*;

public class PostfixToInfix {
    public static String convert(String exp) {
        Stack<String> stack = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                stack.push("(" + op1 + c + op2 + ")");
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String postfix = "ABC*+";
        System.out.println("Infix: " + convert(postfix));
    }
}
