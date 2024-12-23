package testprep;

public interface Payment {

    void processPayment(double amount);

    public static void main(String[] args) {
        Payment[] payments = new Payment[3];
        PayPalPayment pp1 = new PayPalPayment();
        CreditCardPayment cc1 = new CreditCardPayment();
        PayPalPayment pp2 = new PayPalPayment();

        payments[0] = pp1;
        payments[1] = cc1;
        payments[2] = pp2;

        double amount1 = 239.39;
        double amount2 = 123.23;
        double amount3 = 9490.45;

        payments[0].processPayment(amount1);
        payments[1].processPayment(amount2);
        payments[2].processPayment(amount3);
    }
    
}
