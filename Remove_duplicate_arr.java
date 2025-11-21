import java.util.*;

public class Remove_duplicate_arr{
    public static int RemoveDuplicateArray(int arr[]){
        //we using 2 pointer approch (two var i and j)
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;

            }
        }
        return (i+1);
    }


    public static void main(String[] args){
int arr[]={0,0,1,2,2,2,4,5,5};
System.out.println(RemoveDuplicateArray(arr));
    }
}