package OOPs;

class Student {
    int id;
    String name;
    int age;

    public Student(int id,  String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student(){
        id = 1002;
        name = "Jayanth";
        age = 23;
    }
    public Student (int id, String name){
//        this.id = id;
//        this.name = name;
        this(id, name, id);
    }
    public Student(int id){
//        this.id = id;
        this(id, "Vinayak");
    }

    void display(){
        System.out.println("Id of Student " + name + " is " + id  + " and " + age + " year  old");
    }
}
public class MainConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "Vinayak", 23);
        s1.display();
        Student s2 = new Student();
        s2.display();
        Student s3 = new Student(1003);
        s3.display();
        Student s4 = new Student(1004, "Jai Kumar");
        s4.display();
    }
}


