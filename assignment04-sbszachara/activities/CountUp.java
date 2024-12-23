package activities;

import java.util.Scanner;

public class CountUp {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count up.");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }


        scanner.close();

    }
}
