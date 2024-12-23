package testprep;

public abstract class Vehicle {
    private String brand;

    public Vehicle(String b) {
        this.brand = b;
    }

    public abstract void startEngine();

    public void showBrand() {
        System.out.println(this.brand);
    }
}
