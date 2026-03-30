package NumberSystem;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(isPrime(number)){
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
    public static boolean isPrime(int number){
        if(number <= 1 ) {
            return false;
        }
        for(int  i = 2; i<= Math.sqrt(number); i++) { ///i < = number / 2
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
