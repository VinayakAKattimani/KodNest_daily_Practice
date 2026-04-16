package ArraysOps;
import java.util.*;

public class ArraysOpps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students marks want store: ");
        int n = sc.nextInt();
        System.out.println("Array has created successfully for " + n + " number of students");

        int[] marks  = new int[n];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of student " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of student "+ (i+1) +": " + marks[i]);
        }
        System.out.println(Arrays.toString(marks));

        for(int i :  marks){
            System.out.println(i);
        }
    }
}
