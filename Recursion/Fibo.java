package Recursion;

public class Fibo {
    
    public static int FiboNum(int n) {
        if(n ==0 ){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return FiboNum(n-1)+FiboNum(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(FiboNum(n));
    }
}
