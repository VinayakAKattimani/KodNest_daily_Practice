package NumberSystem;

public class FibNumber {
    public static void main(String[] args) {
        int n = 115;
        int first = 0;
        int second = 1;
        int third;
        System.out.println("The first " + n + " Fibonacci numbers are: ");
        for (int i = 1; i <= n ; i++) {
            System.out.println(first);
            third = first + second;
            first = second;
            second = third;

        }
    }
}
