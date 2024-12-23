package testprep;

public class Manager extends Employee implements Payable {

    public Manager(String n, double d) {
        super(n, d);
    }

    @Override
    public void paySalary() {
        double total = this.getSalary() + this.calculateBonus();
        System.out.println("Total salary with bonus is: " + total);
    }

    @Override
    public double calculateBonus() {
        return 0.1 * this.getSalary();
    }
    
}
