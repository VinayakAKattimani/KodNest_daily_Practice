package InhelritanceMetods;
class Parent{
    void eat(){
        System.out.println("Non veg");
    }
    void work(){
        System.out.println("Farming");
    }

}

class Child extends Parent {
    @Override
    void work() {
//        super.work();
        System.out.println("Development");
    }

    @Override
    void eat() {
//        super.eat();
        System.out.println("Pure veg");
    }
    void swim(){
        System.out.println("Child know Swimming");
    }
}
public class AllMethodEx {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.eat();
        p.work();

        Child c = new Child();
        c.work();
        c.eat();
        c.swim();
    }
}
