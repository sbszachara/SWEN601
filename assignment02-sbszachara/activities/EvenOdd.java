package activities;

public class EvenOdd {

    public static void evenOrOdd (int number) {
        if (number % 5 == 0) {
            System.out.println("The number is divisible by 5");
        }

        else if (number % 2 == 0) {
            System.out.println(number + " is even");
        }

        else {
            System.out.println(number + " is odd");
        }
    }

    public static void main (String[] args) {
        evenOrOdd(10);
        evenOrOdd(-7);
        evenOrOdd(22);

    }

    
}
