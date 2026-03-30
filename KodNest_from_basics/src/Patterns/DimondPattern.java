package Patterns;

public class DimondPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        n = 4;
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= n-i; j++) {
               if(j == 0 || i >= 0){
                   System.out.print(" ");
               }
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
//                if(i == 5){
//                    continue;
//                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
