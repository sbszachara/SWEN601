package activities;
import java.util.Scanner;

public class Calendar {
    public static String dayMonth (int d) {
        String suffix = "";
        switch (d) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case 3:
                suffix = "rd";
                break;
            case 21:
                suffix = "st";
                break;
            case 22:
                suffix = "nd";
                break;
            case 23:
                suffix = "rd";
                break;
            case 31:
                suffix = "st";
                break;
            default:
                suffix = "th";
                break;
        }
        return suffix;
    }
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the day:");
        int day = reader.nextInt();
        String dispSuff = dayMonth(day);
        System.out.println("It is the " + day + dispSuff);
        reader.close();
    }
}
