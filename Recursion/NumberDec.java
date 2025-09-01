package Recursion;

public class NumberDec {

    public static void Numberdec(int n) {
        if(n==1){
            System.out.println(1);
            return;
        }                           
        System.out.println(n+"");
          Numberdec(n-1);
    }
public static void NumberInc(int n) {
    if(n==1){
        System.out.println(n+"");
        return;
    }
    NumberInc(n-1);
    System.out.println(n+"");
}
    public static void main(String[] args) {
        int n = 10;
        // Numberdec(n);
        NumberInc(n);
    }
}
