package NOTHING;
import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input values
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        
        // Calculate the required number of flagstones
        long tiles_n = (n + a - 1) / a; // Equivalent to ceil(n / a)
        long tiles_m = (m + a - 1) / a; // Equivalent to ceil(m / a)
        
        // Compute total number of flagstones
        long result = tiles_n * tiles_m;
        
        // Print the result
        System.out.println(result);
        
        sc.close();
    }
}
