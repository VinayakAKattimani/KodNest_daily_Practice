package HasARelation;

public class Programm {
    public static void main(String[] args) {
       Mobile m = new Mobile("Realme", 10000, "Android", 6.5f );
       m.mobileDetails();

       Charger c = new Charger(10, 'C') ;
       c.chargerDetails();
        m.chargerDetails(c);

    }
}
