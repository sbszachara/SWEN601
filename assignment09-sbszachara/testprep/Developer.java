package testprep;

public class Developer extends Employee implements Payable {

    public Developer(String n, double d) {
        super(n, d);
    }

    @Override
    public void paySalary() {
        double total = this.getSalary() + this.calculateBonus();
        System.out.println("Total salary with bonus: " + total);
    }

    @Override
    public double calculateBonus() {
        return 0.05 * this.getSalary();
    }
    
}
