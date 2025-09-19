package Array2D;
import java.util.*;
class InsStrAtIntervals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();   
        String s2 = sc.next();   
        int N = sc.nextInt();    
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i));
            if ((i + 1) % N == 0) {
                result.append(s2);
                result.append(s1);
            }
        }

        System.out.println(result.toString());

        sc.close();
    }
}
