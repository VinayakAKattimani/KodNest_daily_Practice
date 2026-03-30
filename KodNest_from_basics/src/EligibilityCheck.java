import java.util.Scanner;

public class EligibilityCheck {
    public static void checkEligibility(String nation, int age){
        switch (nation){
            case "indian" :
                if(age >= 18){
                    System.out.println("You are eligible to vote in India");
                }else{
                    System.out.println("You are not eligible to vote as you are minor");
                }
                break;
            default:
                System.out.println("Not Indian you are not eligible to vote as you are not Indian");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your nationality");
        String nation = sc.next().toLowerCase();
        System.out.println("Enter your age");
        int age = sc.nextInt();

        checkEligibility(nation, age);
    }

}
