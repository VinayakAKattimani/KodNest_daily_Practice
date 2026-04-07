package Abstraction;

abstract class Animal{
    abstract void eat();
    void sleep(){
        System.out.println("Animal is sleeping");
    }
    abstract void walk();
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer is eating");
    }

    @Override
    void sleep() {
        System.out.println("Deer is sleeping");
    }

    @Override
    void walk() {
        System.out.println("Deer is walking");
    }
}
class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger is eating");
    }

    @Override
    void sleep() {
        System.out.println("Tiger is sleeping");
    }

    @Override
    void walk() {
        System.out.println("Tiger is walking");
    }
}
class Monkey extends Animal {
    @Override
    void eat() {
        System.out.println("Monkey is eating");
    }

    @Override
    void sleep() {
        System.out.println("Monkey is sleeping");
    }

    @Override
    void walk() {
        System.out.println("Monkey is walking");
    }
}
public class Main {
    public static void main(String[] args) {
//        Animal  a = new Animal();   we cannot create object of abstract class|| we cannot inherit final class but we can  create object of it
        forest(new Deer());
        forest(new Tiger());
        forest(new Monkey());

    }
    static void forest(Animal a) {
        a.eat();
        a.walk();
        a.sleep();
    }
}
