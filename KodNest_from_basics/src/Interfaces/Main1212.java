package Interfaces;

import java.io.Serializable;

interface Calc11{
    final static int A = 18;
    void add();
    void sub();
}

class Calc22{
    void mul(){
        System.out.println("Multiplication");
    }
    void div(){
        System.out.println("Division");
    }

}

class MyCalculator extends Calc22 implements Calc11 {
    @Override
    public void add() {
        System.out.println("Addition");
    }

    @Override
    public void sub() {
        System.out.println("Subtraction");
    }
}
public class Main1212 {
    public static void main(String[] args) {
        MyCalculator mc= new MyCalculator();
        int age = 15;
        while(age > mc.A){
            System.out.println("hudwcc");
        }
    }
//    Serializable
}
