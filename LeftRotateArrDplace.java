import java.util.*;


public class LeftRotateArrDplace {

public static void reverse(int arr[],int start,int end){
    //reverse whole array by swap
    while (start<end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        
    }
}

    public static void LeftRotateArrDplace(int arr[],int k){
        int n=arr.length;
        k=k%n;

        //reverse whole arrrya
        reverse(arr,0,n-1);

        //reverse fisrt k element array
        reverse(arr, 0, k-1);
        //revese other reamin array

        reverse(arr, k, n-1);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        LeftRotateArrDplace(arr, 3);
        System.out.println(Arrays.toString(arr));

    }
}
