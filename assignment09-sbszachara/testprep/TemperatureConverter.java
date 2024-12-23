package testprep;

public class TemperatureConverter {

    static double F_TO_C_CONVERSION = 5.0 / 9;

    static {
        System.out.println("Static block initialized");
    }

    public static double farenheitToCelsius(double f) {
        return (f-32) * F_TO_C_CONVERSION;
    }

    public static void main(String[] args) {
        System.out.println(TemperatureConverter.farenheitToCelsius(56.0));
    }

}
