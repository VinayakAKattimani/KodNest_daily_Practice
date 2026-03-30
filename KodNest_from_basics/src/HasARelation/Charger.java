package HasARelation;

public class Charger {
    int voltage;
    char type;

    public Charger(int voltage, char type) {
        this.voltage = voltage;
        this.type = type;
    }

    void chargerDetails() {
        System.out.println(voltage + "volts");
        System.out.println(type + "type");
    }
}
