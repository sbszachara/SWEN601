package activities;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x = "abc";
        Scanner scanner = new Scanner(System.in);
        String y = scanner.nextLine();

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
