package activities;

public class Calculator {
    
    public static void bleh(float x, float y) {
        System.out.println("x=" + x + ", y=" + y);
        System.out.println("x + y =" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x * y =" + (x * y));
    }
    public static void main(String[] args) {
        
        bleh(4, 5);
        bleh (14, 34);
        bleh (938453, 436);
    }

    
}
