package Interfaces;
interface Calculator1{
    void add();
    void sub();
}
interface Calculator2{
    void mul();
    void div();
}
class MyCalc implements Calculator1, Calculator2{

    @Override
    public void add() {
        System.out.println("Addition");
    }

    @Override
    public void sub() {
        System.out.println("Subtraction");
    }

    @Override
    public void mul() {
        System.out.println("Multiplication");
    }

    @Override
    public void div() {
        System.out.println("Division");
    }
}
class Calculator extends MyCalc {
   int a = 10;
   int b = 2;

    @Override
    public void add() {
        System.out.println("Addition of " + a + " and " + b +" is: " + (a + b));
    }
}
public class Main{

}
