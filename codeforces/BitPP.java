import java.util.Scanner;

public class BitPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of statements
        int x = 0; // Initial value of x
        
        for (int i = 0; i < n; i++) {
            String statement = sc.next(); // Read the statement
            
            if (statement.contains("++")) {
                x++; // Increase x
            } else {
                x--; // Decrease x
            }
        }
        
        System.out.println(x); // Print final value of x
        sc.close();
    }
}
