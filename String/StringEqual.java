package String;

public class StringEqual {

    public static void main(String[] args) {
        
        String s1="Nitish";
        String s2 = "Nitish";
        String s3 = new String("Nitish");

        if(s1 ==s2){
          System.out.println("same");    //check same refrence
        }else{
            System.out.println("No");
        }

        if(s1 ==s3){
          System.out.println("same");
        }else{      //object  check only
            System.out.println("No");
        }
         
        if(s1.equals(s3)){
          System.out.println("same");
        }else{
            System.out.println("No");
        }
    }
}



//