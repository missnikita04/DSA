//find number that appear oncde nad other number twicesa
public class Arr11 {
    public  static int FindNumAppearOnce(int arr[]){
        int xorr=0;
        for(int i=0; i<arr.length;i++){
            xorr=xorr^arr[i];
        }
        return  xorr;
    }
    public static void main(String[] args){
        int arr[]={1, 2, 2, 4, 3, 1, 4};
        System.out.println("\n");
        System.err.println(FindNumAppearOnce(arr));
    }
}
