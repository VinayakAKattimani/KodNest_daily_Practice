package Patterns;

public class MyName {
    public static void main(String[] args) {
        int height = 7;

        for (int i = 0; i < height; i++) {
            // V
            for (int j = 0; j < height * 2; j++) {
                if (j == i || j == (height * 2 - 2 - i)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // I
            for (int j = 0; j < height; j++) {
                if (j == height / 2 || i == 0 || i == height - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // N
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height - 1 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < height; j++) {
                if (((j == 0 || j == height - 1) && i != 0) || (i == 0 && j > 0 && j < height - 1) || (i == height / 2)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // Y
            for (int j = 0; j < height; j++) {
                if ((i == j && i < height / 2) || (j == height - 1 - i && i < height / 2) || (j == height / 2 && i >= height / 2)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // A (Repeated)
            for (int j = 0; j < height; j++) {
                if (((j == 0 || j == height - 1) && i != 0) || (i == 0 && j > 0 && j < height - 1) || (i == height / 2)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("  ");

            // K
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height / 2 - i || j == i - height / 2) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }


    }
}
