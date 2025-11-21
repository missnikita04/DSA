

//search number in 2 arrya and return boolean

import  java.util.*;
public class Arr19 {
    public static boolean  SearchNumber(int arr[][],int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return true;
                }
                
            }
          
            
        }
          return  false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
          for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j]=sc.nextInt();
            }
          }

          //function call for search
          System.err.println(SearchNumber(arr, 23));
    
    }
    
}
