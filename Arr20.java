

//2D array

//print 2d aray and make a function to searhc numberr and return the index
import  java.util.*;
public class Arr20 {
    public  static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.err.print(arr[i][j]+" ");
                
            }
            System.err.println(" ");
       
        }

    }
    public  static  void SearchNumberOfIndex(int arr[][],int target){
                for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    System.out.println("target element found at "+i+","+j+"index");
                }
                
            }
       
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();
                
            }
        }

        System.out.println("print 2d arrya");
        printArray(arr);
        SearchNumberOfIndex(arr, 32);
    }
    
}
