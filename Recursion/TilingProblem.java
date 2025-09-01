package Recursion;

public class TilingProblem {
    
    public static int TileProblem(int n) {
         //base case 
         if( n ==1 || n ==0){
            return 1;
         }

         //Vertical tiling 
         int vt = TileProblem(n-1);

         //horizontal tiling
         int ht = TileProblem(n-2);

         return vt + ht;
        
    }
      public static void main(String[] args) {
         int n = 3;
         System.out.println(TileProblem(n));
        //  System.out.println("nitish "+ n);
                  
                  


        
      }
}
