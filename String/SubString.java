package String;

public class SubString {
    public static String Substring(String str ,int si,int ei) {
        String subStr ="";
        for(int i =si;i<ei;i++){
            subStr+=str.charAt(i);
        }
        return subStr; 
    }
 public static void main(String[] args) {
    //Slicing like python
    String str = "Helloworld";
//    System.out.println( Substring(str, 0, 5));

   str.substring(0,5 );  //inbuilt method of subString in Java
    System.out.println(str.substring(2 )); // print "lloworld"


    System.out.println(Substring(str, 0, 5)); // print "Hello"
 }   
}
