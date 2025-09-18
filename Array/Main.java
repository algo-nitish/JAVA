package Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int M = sc.nextInt(); 
            int[] marks = new int[M];

            for (int j = 0; j < M; j++) {
                marks[j] = sc.nextInt();
            }

            int max = marks[0];
            int min = marks[0];
            int total = 0;

            for (int mark : marks) {
                if (mark > max)
                    max = mark;
                if (mark < min)
                    min = mark;
                total += mark;
            }

            double avg = (double) total / M;
            System.out.printf("%d %d %d %.1f%n", max, min, total, avg);
        }
        sc.close();
    }
}
