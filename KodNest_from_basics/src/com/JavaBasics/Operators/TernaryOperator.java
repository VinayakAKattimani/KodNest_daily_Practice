package com.JavaBasics.Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        var a = 5;
        var b = 12;
        var result = (a>b)? "A is greater".toUpperCase() : "B is smaller".toUpperCase();
        System.out.println(result);



    }
}
