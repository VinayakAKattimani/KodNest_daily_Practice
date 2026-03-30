package OOPs;

import java.util.HashMap;

public class Base {
    public static void main(String[] args) {
        Emp e1 = new Emp(101, "Vinayak", 25000);
        System.out.println("Id of " + e1.name +  " is " + e1.id);
        System.out.println("Salary of " + e1.name +  " is " + e1.salary);
    }
}
