package String;

// import java.util.*;


public class BasicString {
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d','e'};
        // String str = "abcde";
        // String str1 = new String("abcde");

        //String are Immutable..can't change.

        // Scanner sc = new Scanner(System.in);
        // // String name ;
        // // name = sc.next(); //it is only for single string means Nitish ...not taking chauhan
        // //for this use nextLine
        // String name2;
        // name2 = sc.nextLine();
        // // System.out.println(name);
        // System.out.println(name2);


        //For Length of String

        // String Fullname = "Nitish Chauhan";
        // System.out.println(Fullname.length());


        //Concatenation
        String Name = "Nitish";
        String LastName = "Chauhan";
        String FullName = Name + " " + LastName;
        System.out.println(FullName);

        //To find the value at index
        // System.out.println(FullName.charAt(6));
    

        //call the function 
       printLetter(FullName);

    }
    public static void printLetter(String Str) {
        for( int i=0;i<=Str.length();i++){
             System.out.println(Str.charAt(i) + " ");
        } //To print the Letters of a string
        System.err.println();
    }
}
