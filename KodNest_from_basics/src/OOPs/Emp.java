package OOPs;

public class Emp {
    int id;
    String name;
    int salary;

    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        AC a  =  new AC();
        a.getCoolant();
    }

}


