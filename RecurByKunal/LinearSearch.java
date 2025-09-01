package RecurByKunal;

import java.util.ArrayList;

class LinearSearch {
    
public static void main(String[] args) {
    int arr[] = {2,3,4,9,8,6,7,6};
    System.err.println(IndexNumber(arr, 9, 0));
    System.out.println(IndexBool(arr, 7, 0));
    System.out.println(findIndex2(arr, 6, 0));
}

 //to return the index
  static int IndexNumber(int []arr , int target, int index) {
    if(index == arr.length){
        return -1;
    }
    if(arr[index] == target){
        return index;
    }
    else{
        return IndexNumber(arr, target, index+1);
    }
    
  }

  //To check only exit or not

  static boolean IndexBool(int []arr , int target, int index){
           if(index == arr.length){
             return false;
           }
           return arr[index] == target || IndexBool(arr, target, index+1);
  }

//To returnn the index for common numbers
 static ArrayList<Integer> findIndex2(int arr[], int target, int index) {
    ArrayList<Integer> list = new ArrayList<>();
    
    if (index == arr.length) {
        return list;
    }

    if (arr[index] == target) {
        list.add(index);
    }

    ArrayList<Integer> resultFromBelowCalls = findIndex2(arr, target, index + 1);
    list.addAll(resultFromBelowCalls);

    return list;
}

}
