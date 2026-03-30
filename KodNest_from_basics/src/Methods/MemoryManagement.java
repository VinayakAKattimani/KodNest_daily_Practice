package Methods;

public class MemoryManagement {
    static void display(int n, int m){
        System.out.println(n + m);
    }
    static int sub(){
        int a = 10;
        int b = 2;
        return a - b;
    }
    public static void main(String[] args) throws InterruptedException {
        int a= 10;
        int b= 20;
        display(a, b);
        Thread.sleep(10000);
        int res = sub();
        System.out.println(res);
    }
}
