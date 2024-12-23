package testprep;

public class Motorbike extends Vehicle {

    public Motorbike(String b) {
        super(b);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorbike engine started");
    }


    
}
