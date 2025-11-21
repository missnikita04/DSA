
//print sum of array
public class Arr16{
    public static int SumOfArray(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];

        }
        return  sum;

    }
    public static void main(String[] args) {
        int arr[]={2,4,2,5,7,3,2,1};
        System.out.println("the sum of total array"+SumOfArray(arr));
    }
    
}