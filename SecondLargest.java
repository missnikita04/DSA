
import java.util.*;
public class SecondLargest{
public  static int  SecondLargestElement(int arr[]){
    int largest=arr[0];
    int secondlargest=-1;

    for(int i=1; i<arr.length; i++){
        if(arr[i]>largest){
            secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]<largest && arr[i]>secondlargest){
            secondlargest=arr[i];
        }
    }
    return secondlargest;



}
    public static void main(String[] args){
        int arr[]= {8, 8, 7, 6, 5};
        System.out.println(SecondLargestElement(arr));

    }
}