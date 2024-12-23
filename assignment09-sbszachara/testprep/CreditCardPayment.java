package testprep;

public class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Procesing credit card payment of {" + amount + "}");
    }
    
}
