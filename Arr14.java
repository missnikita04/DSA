


//find elemnt in array

public class Arr14{
    public static int FindElement(int arr[],int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,2,5,7,3,2,1};
        int res=FindElement(arr, 2);
        System.out.println("the index of target el is "+ res);
    }}