package testprep;

public class Car extends Vehicle {
    
    public Car(String b) {
        super(b);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

}
