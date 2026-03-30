package Patterns;

public class InvertedPyramid {
    public static void main(String[] args) {
     int a = 5;
        for(int i = 5; i > 0; i--){
            for(int j = 0; j < a - i; j++ ){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
