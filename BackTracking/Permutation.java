package BackTracking;

public class Permutation {
      public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }

    static void findPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursively pick each character
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            // Exclude the current character from the string
            String newStr = str.substring(0, i) + str.substring(i + 1);//bc

            // Recur with the updated string and new answer
            findPermutation(newStr, ans + curr);
        }
    }
}
