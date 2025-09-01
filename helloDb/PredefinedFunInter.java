package helloDb;

import java.util.function.BiFunction;

public class PredefinedFunInter {

    static class Arithmetic {
        public static int add(int a, int b) {
            return a + b;
        }
    }

    public static class MethodReference3 {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;

            int result = adder.apply(10, 20);
            System.out.println(result);
        }
    }
}
