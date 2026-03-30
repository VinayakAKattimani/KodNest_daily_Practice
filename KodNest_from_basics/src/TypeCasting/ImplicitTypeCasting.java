package TypeCasting;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        String s1 = new String("KodNest");
        String s2 = "KodNest";
        System.out.println(s2 == s1.intern());
    }
}
