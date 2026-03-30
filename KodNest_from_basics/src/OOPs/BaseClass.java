package OOPs;

public class BaseClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1001;
        e1.name = "Nikitha";
        e1.salary = 100000;

        System.out.println("Employee name is:" + e1.name);

        System.out.println("Employee id is:" + e1.id);

        System.out.println("Employee salary is:" + e1.salary);

        e1.working();

        e1.attendingMeeting();
    }
}
