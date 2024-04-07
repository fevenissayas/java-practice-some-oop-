import java.util.Arrays;

class TempConverter {
    static void ConvertTemp(double Celsius) {
//        UsingControlStructures u = new UsingControlStructures ();
        double Fahrenheit;
        Fahrenheit = (9. / 5) * Celsius + 32;
        System.out.println(Fahrenheit);

    }

    public static void main(String[] args) {
        ConvertTemp (100);
    }
}
