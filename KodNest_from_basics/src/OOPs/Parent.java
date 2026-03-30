package OOPs;

import Patterns.SolidSquare;

class Animal{

}
class Tiger extends Animal {

}

public class Parent {
    Animal display(){
        System.out.println("HI");
        Animal a = new Animal();
        return a;
    }
}

class Child extends Parent {
    @Override
    Tiger display(){
        System.out.println("Hello");
        Tiger t = new Tiger();
        return t;
    }

}
