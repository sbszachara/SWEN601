package activities;
import java.util.Scanner;

public class Register {
    public static String makinChange (float c, float p) {
        float change = p - c;
        System.out.println(change);
        int doll = (int)change;
        float cents = change - (float)doll;
        float centDisplay = cents * 100;
        String sinCent = "";
        if ((int)centDisplay == 1) {
            sinCent = "";
        }
        else {
            sinCent = "s";
        }
        String sinDoll = "";
        if (doll == 1) {
            sinDoll = "";
        }
        else {
            sinDoll = "s";
        }
        String stateMent = "Your change is " + doll + " dollar" + sinDoll + " and " + (int)centDisplay + " cent" + sinCent;
        return stateMent;
    }

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the charge:");
        Float chargeInp = reader.nextFloat();
        System.out.println("Enter the payment:");
        Float paypay = reader.nextFloat();
        System.out.println(makinChange(chargeInp, paypay));
        reader.close();
    }
}
