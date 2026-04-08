package Interfaces;

import java.io.Serializable;

interface Calc11{
    int i = 0;
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
//    Serializable
}
