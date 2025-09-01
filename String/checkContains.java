package String;
public class checkContains {
    public static void main(String[] args) {
        
        String str = "abc#def&gh"; 
        boolean hasHash = str.contains("#");
        boolean hasAmp = str.contains("&");
        boolean isEven = (str.length() % 2 == 0);
        if (hasHash && hasAmp && isEven) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
    }
}
