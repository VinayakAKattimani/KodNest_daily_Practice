package Interfaces;
interface Calc1{
    void add();
    void sub();
}
interface Calc2 extends Calc1 {
    void mul();
    void div();
}
class Calculator111 implements Calc2 {
    @Override
    public void mul() {
        System.out.println("Multiplication");
    }

    @Override
    public void div() {
        System.out.println("Division");
    }

    @Override
    public void add() {
        System.out.println("Addition");
    }

    @Override
    public void sub() {
        System.out.println("Subtract");
    }
}

public class Program111 {
}
