package IsARelationShip;

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


public class Main {
    public static void main(String[] args) {
        System.out.println("\n---- Cargo Plane Details ----");
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.land();

        System.out.println("\n---- Passenger Plane Details ----");
        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
        pp.land();

        System.out.println("\n---- Fighter Plane Details ----");
        FighterPlane fp = new FighterPlane();
        fp.takeOff();
        fp.fly();
        fp.land();
    }

}
