package BackTracking;

// Subset of a string using backtracking

public class SubSetSTRING {
    public static void  Subset(String str , String ans , int i) {
        //base case
         if(i == str.length()){
            System.out.println(ans);
            return;
         }

        //recursive case

        //yes choice
        Subset(str, ans+str.charAt(i), i+1);
        //no choice
        Subset(str , ans , i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        Subset(str, "", 0);
    }
}
