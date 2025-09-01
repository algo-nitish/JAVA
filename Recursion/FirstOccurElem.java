package Recursion;

public class FirstOccurElem {
    
public static int Firstoccurence(int arr[],int key ,int i) {
    if(i == arr.length){
        return -1;

    }if(arr[i] == key){
        return i;
    }
    return Firstoccurence(arr, key, i+1);
    
}
    public static void main(String[] args) {
        //first occurence of an element in array
        int arr[]= {8,3,6,9,5,10,2,5,3};
        System.out.println(Firstoccurence(arr, 5, 0));
    }
}
