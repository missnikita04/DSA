import java.util.*;

public class Check_Sorted_Arr{
    public static boolean CheckArraySorted(int arr[]){
        for(int i=0;i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false; ///cause fisrt value is greater then second
            }
           
        }
        return true;

    }


    public static void main(String[] args){
int arr[]= {1, 2, 8, 4, 5};
System.out.println(CheckArraySorted(arr));
    }
}