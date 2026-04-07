package PolymorphismOps;


class Plane {
    void takeOff() {
        System.out.println("plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is Landing");
    }
}

class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo Plane fly at lower Altitude");
    }
}

class PassengerPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Passenger Plane fly at medium altitude");
    }
}

class FighterPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Fighter planes fly at Higher altitude");
    }
}
class Airport {
    void boarding(Plane p) {
        p.takeOff();
        p.fly();
        p.land();
    }
}

public class Program {

    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport abc = new Airport();
        abc.boarding(cp);
        abc.boarding(pp);
        abc.boarding(fp);
    }
}
