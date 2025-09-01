package RecurByKunal.String;

import java.util.ArrayList;

public class AllSubSqquence {
    public static void main(String[] args) {
        subsequence("", "abc");

                ArrayList<String> result = subseqRet("", "abc");
        System.out.println(result);

    }

    static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char  ch = up.charAt(0);
        subsequence(p+ch, up.substring(1));
        subsequence(p, up.substring(1));
        //for Ascii value 
                subsequence(p+(ch+0), up.substring(1));


    }



     static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }





}
