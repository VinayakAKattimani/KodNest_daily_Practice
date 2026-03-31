package OOPs;
class Parent1{
    int i = 10;
    void display(){
        System.out.println(i);
    }
    void print(){
        System.out.println("Jai Hind");
    }
}
class Child1 extends Parent1{
    int i = 100;

    @Override
    void display() {
        System.out.println(i);

        System.out.println(super.i);
        super.print();
    }
}
public class Lecture {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.display();
        Parent1 c = new Child1();
//        Child1 p = new Parent1();

    }
}
