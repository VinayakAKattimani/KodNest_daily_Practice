package ClassAndObjects;

import java.util.Arrays;
import java.util.Scanner;

public class AllDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
//                System.out.println("Enter element of array: ");
                arr[row][col] = sc.nextInt();
            }
        }
//        for(int i = 0; i<arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for(int i = 0; i<arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
