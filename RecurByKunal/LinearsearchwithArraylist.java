package RecurByKunal;

import java.util.ArrayList;

class LinearsearchwithArraylist {
    
    public static void main(String[] args) {
          int arr[] = {1,2,4,2,3,4,1,2,};
          findIndex(arr, 1, 0);
        //   System.err.println(findIndex(arr, 2, 0));
    }


    static ArrayList<Integer> findIndex(int arr[] , int target, int index ){
                ArrayList<Integer> list = new ArrayList<>();
           if(index == arr.length){
            return list;
           }
           if(arr[index ]== target){
            list.add(index);
           }
           ArrayList<Integer> backfromabove = findIndex(arr, target, index+1);
           list.addAll( backfromabove);
           return list;
        }
    }
