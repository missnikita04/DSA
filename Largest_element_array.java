
import java.util.*;
public class Largest_element_array{
    public static int findLargest(int arr[]){
        int largest=arr[0];
        int largidx=0;
        for (int i =1; i<arr.length; i++){
            if(arr[i]>largest){
            largidx=i;
           largest=arr[i];
            }
           

        }
        return largest;
    }
public static void main(String[] args){
    int arr[]={34 ,3 ,45,32,24,2,3};
   System.out.println(findLargest(arr));

}




}