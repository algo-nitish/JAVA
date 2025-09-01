package String;  

public class palindrome {  
    // Racecar , madam, noon..  
    public static boolean palindrome1(String str1){  
        int n = str1.length();  
     for(int i =0; i< str1.length() ; i++){  
        if(str1.charAt(i) != str1.charAt(n-1-i)){  
            return false;  
        }  
     } return true;  
    }  




    public static void main(String[] args) {  
        String str = "racecar";  
       System.out.println(palindrome1(str));  
    }  

}  
