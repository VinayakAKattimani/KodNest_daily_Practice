package HasARelation;

public class Mobile {
    String brand;
    int price;
    Os os;

    public Mobile(String brand, int price, String name, float size) {
        this.brand = brand;
        this.price = price;
        os = new Os(name, size);

    }
    void mobileDetails() {
        System.out.println("Band Name: " + brand);
        System.out.println("Price: " + price);
        os.osDetails();
    }

    void chargerMobil(Charger ch) {
        ch.chargerDetails();;
    }

}
