package Patterns;

import java.util.Scanner;

public class HallowRightAngleTriAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Logic for a dynamic hollow triangle with a 2-row top
                if (i == 1 || i == 2 || i == n || j == 1 || j == i) { //i ==1 || j == 5 || j == i
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
