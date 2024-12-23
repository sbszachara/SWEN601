package activities;

public class WeightConverter {

    public static double returnPoundToKilo(double b) {
        System.out.println("Pounds = " + b);
        double c = b / 2.2;
        return c;

    }

    public static void main (String args[]) {
       double w1 = returnPoundToKilo(90);
        double w2 = returnPoundToKilo(230);

        System.out.println(w1);
        System.out.println(w2);
    }
    
}
