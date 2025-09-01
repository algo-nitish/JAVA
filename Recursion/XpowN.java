package Recursion;

public class XpowN {
    public static int power(int x ,int n) {

        if(n ==0){
            return 1;
        }//1:57:30 recursion break
        return x * power(x, n-1);
    }

    //optimzed 
    public static int Optimize(int a ,int b) {
        if(b ==0){
            return 1;
        }
        int halfpow =Optimize(a, b/2) ;
        int halfPowSq =  halfpow * halfpow; //for even

        //for odd
        if(b%2 != 0){
            halfPowSq = a * halfPowSq;
        }
        return halfPowSq;
    }


    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(Optimize(2, 10));
    }
}

//for more omptimization
/*
 * O(logn)
 * if power of x is even then ==> X pow n/2 + X pow n/2
 * if power of x is odd then ==>  X pow 1 +  X pow n/2 + X pow n/2
 */