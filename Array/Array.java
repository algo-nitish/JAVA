package Array;
public class Array {
    public static void main(String[] args) {
        int Array[] = {1,2,3,55,6,7,46};
         int target = 16;
         //linear search
        for (int i =1 ;i<=Array.length; i++)
        {
            if(Array[i] == target){
                System.out.println(i);
            }
           
        }  
    } 
}
