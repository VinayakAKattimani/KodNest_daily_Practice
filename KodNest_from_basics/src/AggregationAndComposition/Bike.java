package AggregationAndComposition;

public class Bike {
    double mileage;

    public Bike(double mileage) {
        this.mileage = mileage;
    }

    void bikeDisplay() {
        System.out.println("Bike gives " + mileage + "mileage");
    }

}
