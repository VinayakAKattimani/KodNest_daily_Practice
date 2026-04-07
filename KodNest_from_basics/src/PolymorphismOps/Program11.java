package PolymorphismOps;

class Parent {
    void display1() {
        System.out.println("Parent Class display1");
    }
    void display2() {
        System.out.println("Parent Class display2");
    }
}

class Child1 extends Parent {
    @Override
    void display2() {
        System.out.println("Child1 class display2");
    }
    void childSpecific() {
        System.out.println("Child1 Specific Menthod");
    }
}

class child3 extends Parent {
    @Override
    void display1() {
        super.display1();
    }

    @Override
    void display2() {
        super.display2();
    }
}

class Child2 extends Parent {
    @Override
    void display2() {
        System.out.println("Child2 class display2");
    }

    void childSpecific() {
        System.out.println("Child2 Specific Menthod");
    }
}
public class Program11 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        accessDisplay(c1);
        accessDisplay(c2);

    }
    static void accessDisplay(Parent p) {
        p.display1();
        p.display2();
        if (p  instanceof Child1 ) {
            ((Child1) p).childSpecific();
        } else if (p instanceof Child2) {
            ((Child2) p).childSpecific();

        }
    }
}
