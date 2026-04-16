package TwoDimArray;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArrayOps {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number of class: ");
        int cls = sc.nextInt();
        System.out.println("Enter number of students in each class: ");
        int students = sc.nextInt();

        int[][] arr = new int[cls][students];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number of students in class " + (i + 1) +": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the number of marks in class " + (i + 1) + " of " + (j+1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("class: " + (i+1) );
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}
