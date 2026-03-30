package HasARelation;

public class Os {
    String name;
    float size;

    public Os(String name, float size) {
        this.name = name;
        this.size = size;
    }

    void osDetails() {
        System.out.println("OS name: " + name);
        System.out.println("OS size: " + size);
    }
}
