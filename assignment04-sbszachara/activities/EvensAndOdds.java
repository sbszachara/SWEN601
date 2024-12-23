package activities;
import java.util.Scanner;

public class EvensAndOdds {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do { 
            System.out.println("Enter a number:");
            n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
    
        } while (n != 0);
        System.out.println("Done");
        scanner.close();
    }
    
}
