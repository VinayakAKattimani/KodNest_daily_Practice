package AggregationAndComposition;

public class Person {
    String name;
    int age;
    Brain brain;

    public Person(String name, int age, String nerves) {
        this.name = name;
        this.age = age;
        brain = new Brain(nerves);
    }

    void personDetails() {
        System.out.println("Person name is:" + name + ".");
        System.out.println(name + " is " + age + " year old.");
        brain.brainDetails();
    }

    void hasBike(Bike bike){
        bike.bikeDisplay();
    }



}
