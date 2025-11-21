


//take 2d array value from user and preint it
import  java.util.*;
public class Arr18 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
    //we take input for size of row and colum
    int row=sc.nextInt();
    int column=sc.nextInt();
    int arr[][]=new int[row][column];

    //start loop tpo enter the value in eahc row and columnm
    for(int i=0; i<row; i++){
     for(int j=0; j<column; j++){
          arr[i][j]=sc.nextInt();
     }
    }


    //print the 2d arrya
    for(int i=0 ; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            System.out.print(arr[i][j]);
        }
        System.err.println(" ");
    }
    }
    
};
