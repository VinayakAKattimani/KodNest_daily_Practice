package OOPs;
class Demo1{
    Demo1(){
        System.out.println("Hi");
    }
    Demo1(int a) {
        this();
        System.out.println("Hello");
    }
}

class Demo2 extends Demo1 {
    Demo2(){
        this(20, 30);
        System.out.println("Welcome");
    }
    Demo2(int a, int b){
        super(b);
        System.out.println("Good Morning");
    }

}


public class Okish {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
    }
}
