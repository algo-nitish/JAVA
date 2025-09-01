package Recursion;

public class Factorial {
   public static int FactNum(int n) {
    if(n==0){
        return 1;
    }
    // int fnm = FactNum(n-1);
    // int fn = n * FactNum(n-1);
    return n * FactNum(n-1);
   }


    public static void main(String[] args) {
      int n = 7;
     System.out.println(FactNum(n));
    }
}
