package activities;

public class Register {

    public static void chargeNpay (float charge, float pay) {
        double differ = pay - charge;
        int d = (int)differ;
        String dollars = d == 1 ? "dollar" : "dollars";
        int c = (differ - d) * 100;
        String cents = c == 1 ? "cent" : "cents";
        System.out.println("Your change is " + d + dollars + " and " + c + cents);
    }

    public static void main(String[] args) {
        chargeNpay(22.75, 30.00);
    }
    
}
