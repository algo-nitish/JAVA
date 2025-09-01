package NOTHING;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        int n = sc.nextInt(); // Number of participants
        int k = sc.nextInt(); // Position to check for qualification
        int[] scores = new int[n]; // Array to store scores

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int kthScore = scores[k - 1]; // Score of the k-th participant
        int count = 0;

        // Count the number of participants who qualify
        for (int score : scores) {
            if (score >= kthScore && score > 0) {
                count++;
            }
        }

        // Print the result
        System.out.println(count);

        sc.close();
    }
}
