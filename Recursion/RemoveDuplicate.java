package Recursion;

public class RemoveDuplicate {
    
  public static void DeleteDuplicate(String str , int idex, StringBuilder newStr, boolean map[])
  {
     if(idex == str.length()){
        System.out.println(newStr);
        return;
     }

     //Kaam --> check whether the character is present or not
     char currChar = str.charAt(idex);
     if(map[currChar - 'a'] == true){
        //present means duplicate
        DeleteDuplicate(str, idex+1, newStr, map);
     }
     else{
        map[currChar - 'a'] = true; //mark as present for non -duplicate
        DeleteDuplicate(str, idex+1, newStr.append(currChar), map);
     }
  }

    public static void main(String[] args) {
       String str = "nitish chauhan";
       DeleteDuplicate(str, 0, new StringBuilder(""), new boolean[26]);   
    }
}
/*
 *        Code Block	                                  Handles
if(map[currChar - 'a'] == true)      	✅ Duplicates (skips them)
else { ... append(currChar) ... }     	✅ Non-duplicates (keeps them)
 */