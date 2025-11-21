

//Given an integer array nums of size n, return the majority element of the array.
public class Arr13 {
    public  static  int MajorityElement(int arr[]){
        int n=arr.length;
        for(int i=0; i<arr.length ; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                
            }

            //majority condition 
            if(count>n/2){
                    return arr[i];
                }
            
        }
        return  -1;

    }
    
    public static void main(String[] args) {
        int arr[]={7, 0, 0, 1, 7, 7, 7, 7, 7};
        System.out.println("\n");
        System.out.println(MajorityElement(arr));

    }
}
