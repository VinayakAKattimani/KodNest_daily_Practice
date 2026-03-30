package OOPs;

class Login {
    String mobileNum;
    String email;
    String userName;
    String password ;

    public Login(String mobileNum, String password){
        this.mobileNum = mobileNum;
        this.password = password;
    }

    public Login(String email){
        this(email, "12345");
        this.email = email;
    }

    public void display() {
        if (password.equals("12345")){
            System.out.println("LOGIN SUCCESSFUL!!!!!!!!!!!!");
        } else {
            System.out.println("INVALID CREDENTIALS");
        }
    }
}



public class ConstructorChaining {
    public static void main(String[] args) {
    Login l1 = new Login("7259933245", "12345");
    Login l2 = new Login("vinaykattimani@gmail.com");

    l1.display();
    l2.display();

    }
}
