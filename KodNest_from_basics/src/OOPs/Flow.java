package OOPs;
class Donkey {
    int id;
    String name;
    public Donkey(int id, String name){
        this.id = id;
        this.name = name;
    }

    static {
        System.out.println("Inside the static block");
    }

    {
        System.out.println("Inside the non-static block");
    }
    void display(){
        System.out.println("the id of " + name + " is " + id);
    }
}
public class Flow {
    public static void main(String[] args) {
        Donkey d1 = new Donkey(100, "Rahul Gandhi");
        d1.display();
        Donkey d2 = new Donkey(101, "CM sidda");
        d2.display();


    }
}
