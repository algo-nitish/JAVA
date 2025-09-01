package Recursion;

public class BinStringProb {
    
  public static void PrintBinString(int n, int lastPlace ,String str) {
     //kaam
    //  if (lastPlace == 0) {
    //     PrintBinString(n-1, 0, str.append("0"));
    //              PrintBinString(n-1, 1, str.append("1"));
    //  }
    // else{
    //             PrintBinString(n-1, 0, str.append("0"));

    // }


    //  base case
   if(n == 0){
        System.out.println(str);
        return;
    }


     PrintBinString(n-1, 0, str+"0");
     if(lastPlace == 0){
         PrintBinString(n-1, 1, str+"1");
     }
  }

  public static void main(String[] args) {
    PrintBinString(3, 0, "");
  }

}

/*
 * Binary Strings Problem

Print all binary strings of size N without consecutive ones.
 */
