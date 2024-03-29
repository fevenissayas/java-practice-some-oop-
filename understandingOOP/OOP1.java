package understandingOOP;

public class OOP1 {
    public static void main(String[] args) {
        OOP oo = new OOP("John");
        OOP pp = new OOP();

        pp.setName("Abebe");
        System.out.println(oo.getName());
        System.out.println(pp.getName());
    }
}
