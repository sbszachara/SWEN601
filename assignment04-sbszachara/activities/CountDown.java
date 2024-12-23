package activities;

import java.util.Scanner;

public class CountDown {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count down.");
        int n = scanner.nextInt();

        while (n > 0) {
            n = n - 1;
            System.out.println(n);
        }


        scanner.close();

    }
}
