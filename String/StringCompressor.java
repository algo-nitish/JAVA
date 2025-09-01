package String;

public class StringCompressor {

    public static String compress(String str) {
        String newStr = "";
        // Example: "aaabc"

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += Integer.toString(count);
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbccdd";
        System.out.println(compress(str));  // Output: a3b2c2d2
    }
}



//using set builder pattern
/*
 * package String;

public class StringCompressor {

    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder();
        // Example: "aaabc"

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count);
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccdd";
        System.out.println(compress(str));  // Output: a3b2c2d2
    }
}

 */