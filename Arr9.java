//Finding missing number in an Array

public class Arr9 {
    public static  int FindMissignNumberArray(int arr[])
    {
        int n=arr[arr.length-1];
        int sum=(n*(n+1))/2;

        int sum2=0;
        for(int i=0; i<arr.length; i++){
             sum2=arr[i]+sum2;
        }
        return  (sum-sum2);

    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        System.out.println("/n");
        System.out.println(FindMissignNumberArray(arr));
    }
}
