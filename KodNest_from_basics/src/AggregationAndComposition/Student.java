package AggregationAndComposition;

public class Student extends Person {

    public Student(String name, int age, String nerves) {
        super(name, age, nerves);
    }

    public static void main(String[] args) {
        Student student = new Student("Rahul Ghandi", 55, "No Neurons");
        Bike bike = new Bike(45.5);
        student.personDetails();
        student.hasBike(bike);
        student.brain.brainDetails();


    }
}
