package Recursion;

public class FriendsPair {
    
    public static int FriendPair(int n) {

        if(n == 1 || n ==2){
              return n;
        }
        // // choice
        // int fnm1 = FriendPair(n-1); //single

        // int fnm2 = FriendPair(n-2); //pair
        // int pairWays = (n-1) * fnm2;

        // // Totalways
        // int TotalWays = fnm1 + pairWays;
        // return TotalWays;
    
    return FriendPair(n-1) + (n-1) * FriendPair(n-2);
    
    
    
    }
   public static void main(String[] args) {
    int n = 3;
    System.out.println(FriendPair(n));
   }         
    }





/*
 * Friends Pairing Problem
Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
 */