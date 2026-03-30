package NumberSystem;


public class PrimeNumberInRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        isPrime(start, end);


    }
    public static void isPrime(int start, int end){
        System.out.println("Prime number between " +start + " and " + end + " are: ");
        for(int num = start; num <= end; num++ ){
            if(num <= 1){
                continue;
            }
            boolean isOk = true;
            for(int i = 2; i <= (num/2); i++){
                if( num % i == 0) {
                    isOk = false;
                }
            }
            if(isOk){
                System.out.println(num);
            }
        }

    }
}
