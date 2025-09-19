package Array2D;
import java.util.*;
class ASCIIrangeCharCounter {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();

        int count = 0;
        for (int i = 0; i < K; i++) {
            int ascii = (int) S.charAt(i);
            if (ascii >= N && ascii <= M) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
