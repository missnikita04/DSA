import java.util.*;
public class MoveZerosToEndOfArray {
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];

        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static int[] MoveAllZeroInEnd(int arr[]){
        //step-1  find fisrt zero indx
        int j=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                j=i;
                break;
            }

        }
        if(j==-1)return arr;

        //step-2 swap non zero elemt with j
        for (int i=j+1; i<arr.length; i++){
            if(arr[i]!=0){
            swap(arr, i, j);
            j++;

            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[]={3,1,0,4,2,0,0,3,0,10,6,1};
 System.out.println(Arrays.toString(MoveAllZeroInEnd(arr)));    }
}
