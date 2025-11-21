
import java.util.*;
public class LinearSearch {
    public static int LinearSearch(int arr[],int target){
        for(int i=0; i<arr.length; i++){
            //if arr[i]==our target value it return the idx of value 
           if(arr[i]==target){
            return i;
           }
        }
        //if not found value it retunr null
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,34,1,56,3,2,5,8};
        System.out.println(LinearSearch(arr, 82));
        
    }
}
