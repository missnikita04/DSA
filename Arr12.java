//Two Sum : Check if a pair with given sum exists in Array
public class Arr12 {
    public static int[] TwoSum(int arr[],int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]+arr[i]==target){
                    return new int[] {i,j};  //return pair of ind if use arr[i],arr[j] retunr value of indx
                }
            }
        }
        return  new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int ans[]=TwoSum(arr, 13);
        System.out.println(ans[0]+","+ans[1]);
    }
    
}
